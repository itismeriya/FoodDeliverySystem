package orderingsystem;
import java.time.LocalTime;
import java.util.Arrays;
public class Menu {

	 private int id;
	 private String name;
	 private float ratings;
	 private double price;
	 private LocalTime time=LocalTime.of(00, 30);
	 
	 
	 Restaurant[] restaurants=new Restaurant[5];
	 
	 public Restaurant[] getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getRatings() {
		return ratings;
	}
	public double getPrice() {
		return price;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}


	public Menu(int id, String name, float ratings, double price) {
		super();
		this.id = id;
		this.name = name;
		this.ratings = ratings;
		this.price = price;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", ratings=");
		builder.append(ratings);
		builder.append(", price=");
		builder.append(price);
		builder.append(", time=");
		builder.append(time);
		builder.append(", restaurants=");
		builder.append(Arrays.toString(restaurants));
		builder.append("]");
		return builder.toString();
	}
	
}
