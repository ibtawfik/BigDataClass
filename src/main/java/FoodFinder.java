import se.walkercrou.places.GooglePlaces;
import se.walkercrou.places.Param;
import se.walkercrou.places.Place;
import se.walkercrou.places.Review;

import java.util.List;

/**
 * Created by islam on 2/28/16.
 */
public class FoodFinder {

    public static void main(String[] args) {
        GooglePlaces client = new GooglePlaces("AIzaSyCKntGkGIwq6kQy7_Mu_Oy5iJIBu8lDt9M");
        List<Place> places = client.getNearbyPlaces(40.72, -73.99, 500, 20, Param.name("type").value("food"));
        for(Place place : places){
            Place detailed = place.getDetails();
            System.out.println(detailed.getName());
            System.out.println(detailed.getPrice());
            System.out.println(detailed.getTypes());
            for(Review review: detailed.getReviews()){
                System.out.println(review.getAuthor());
                System.out.println(review.getRating());
                System.out.println(review.getText());
            }
        }

    }
}
