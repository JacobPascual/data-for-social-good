import java.util.Scanner;


public class UserStory {

  /*
  * This uses Entity as the return type because its using the entity class to gather data
  * The entity return type allows everything within the list to be a new Entity object
  */
    private Entity[] restaurantData; //The array of restuarant objects
    private String[] filteredRestaurantNames; // A list containing a list of the resturants with no duplicates



  /*
  * Reads information from the restaurant and ratingfiles 
  * to create indexes in restaurantData
  */
  public UserStory(String restaurantFile, String ratingFile){
    restaurantData = makeRestaurantObjects(restaurantFile, ratingFile);
  }


  /*
  * Returns an initialized list of Entity objects 
  * using the restaurant and rating files
  */
  public Entity[] makeRestaurantObjects(String restaurantFile, String ratingFile){
    String[] name = FileReader.toStringArray(restaurantFile);
    int[] rate = FileReader.toIntArray(ratingFile);
    filteredRestaurantNames = FileReader.toStringArray("uniqueNames.txt");
    

    
    
    Entity[] count = new Entity[rate.length];
    
    for(int i = 0; i < count.length; i++){
      count[i] = new Entity(name[i], rate[i]);
    }

    return count;
  }

  
  
    //Returns the average rating of the given restaurant
    public double getAvgRating(String name){
      int total = 0;
      int count = 0;
      for(int i = 0; i < restaurantData.length; i++){
        if(restaurantData[i].getRestaurant().equals(name)){
          count++;
          total += restaurantData[i].getRating();
        }
      }
      double ret = total / count;
      return ret;
  }

    //Returns the percentage of the amount of times a restaurant occurs in the restaurantData list
    public String getPercentOccur(String name){
      String ret = "";
      double numOccur = getOccurence(name);
      
      
      double percent = (numOccur / restaurantData.length) * 100;
      
      
      ret += percent + "%";
      
      return ret;
    }

  //Returns a list of the unique values from the restaurantData list
  public String getFilteredData(){
    String ret = "";
    for(int i = 0; i < filteredRestaurantNames.length; i++){
      ret += filteredRestaurantNames[i] + "\n";
    }
    return ret + "\n" + filteredRestaurantNames.length;
  }


  //Returns the amount of times a restaurant name value is repeated in the restaurantData list
  public int getOccurence(String name){
    int count = 0;
    for(int i = 0; i < restaurantData.length; i++){
      if(restaurantData[i].getRestaurant().equals(name)){
        count++;
      }
    }
    return count;
  }

  /* 
  * Returns a string that displays information about each 
  * restaurant's rating and popularity
  */
  public String toString(){
    String result = "";


    for(int i = 0; i < filteredRestaurantNames.length; i++){
      int count = i+1;
      result += "----------------\n#" + count + "\n\n Restaurant: " + filteredRestaurantNames[i] + "\n Average Rating: " + getAvgRating(filteredRestaurantNames[i]) + "\n " + getPercentOccur(filteredRestaurantNames[i]) + 
        " of voters chose to review this restaurant \n\n\n"; 
    }
    return result + "----------------";
  }

  
}