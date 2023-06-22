package orderingsystem;

public class RestaurantService {
    static Restaurant[] restaurants = new Restaurant[10]; // Create an array for storing resturant list
    static int index = 0;
   
    static void addRestaurant(Restaurant rest){
        restaurants[index++] = rest;
        //index++;
        //System.out.println("Restaurant added SUCCESSFULLY");
    }

    static void getAllRestaurant(){
        for (int i = 0; i<index; i++){
            System.out.println("Resturant ID : " + restaurants[i].getId());
            System.out.println("Resturant Name : " + restaurants[i].getName());
            System.out.println("Resturant Ratings : " + restaurants[i].getAddress());
        }
    }
}
