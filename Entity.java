public class Entity{

  private String restaurant;
  private int rating;

  //Constructors
public Entity(){
  restaurant = "Nothing";
  rating = 0;
}
  
  public Entity(String restaurant, int rating){
    this.restaurant = restaurant;
    this.rating = rating;
  }


//Getter Methods to return the restaurant names and ratings

  //Gets and returns the restaurant name
  public String getRestaurant(){
  return restaurant;
}

  //Gets and returns the restaurant rating
  public int getRating(){
    return rating;
  }
  





  //toString Method to return the restaurant and rating
  public String toString(){
    return restaurant + " Rating: " + rating;
  }









  
}