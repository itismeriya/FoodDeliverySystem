package orderingsystem;
import static orderingsystem.RestaurantService.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import static orderingsystem.MenuService.*;
import static orderingsystem.AdminUserOperations.*;

public abstract class UserOperations {

	static OrderDetails[] orders=new OrderDetails[10];
	static int orderId=1;
	static int orderIndex=0;
	static Scanner sc=new Scanner(System.in);
	abstract void searchRestaurant(String location);
	{
		System.out.println("Restaurant Name||\t Restaurant Address||");
		int rindex = 0;
		for(int i=0;i<rindex;i++)
		{
			Object location = null;
			if(restaurants[i].getAddress().equals(location))
			{
				System.out.println(restaurants[i].getName()+"\t"+restaurants[i].getAddress());
				System.out.println("~~~~~~Menus are~~~~~~~~");
				Menu[] m=restaurants[i].getMenu();
				for(int j=0;j<m.length;j++)
				{
					if(m[j]==null)
					{
						continue;
					}
					else
					{
						System.out.println("Menu name:"+m[j].getName());
						System.out.println("Menu price:"+m[j].getPrice());
						System.out.println("Expected Delivery within:"+m[j].getTime()+"Mins");
						System.out.println("========================================================================");
					}
				}
			}
		}
	}

static void showAllRestaurantsWithMenu()
{
	System.out.println("Restaurant Id||\t Restaurant Name||\t Restaurant Address"+	"||");
	int rindex = 0;
	for(int i=0;i<rindex;i++)
	{
		System.out.println(restaurants[i].getName()+"\t"+restaurants[i].getAddress());
		System.out.println("~~~~~~~~~~~~Menus are~~~~~~~~~~~~~");
		Menu[] m=restaurants[i].getMenu();
		for(int j=0;j<m.length;j++)
		{
			if(m[j]==null)
			{
				continue;
			}
			else
			{
				System.out.println("Menu name:"+m[j].getName());
				System.out.println("Menu price:"+m[j].getPrice());
				System.out.println("Expected delivery within:"+m[j].getTime()+"Mins");
				System.out.println("===================================================================");
			
			}
		}
	}
}
static void placeOrder()
{
	double amount=0.0,totalAmount=0.0;
	showAllRestaurantsWithMenu();
	System.out.println("Enter 1. for place order\nEnter 2.for get back to "+ "the menu");
	int c=sc.nextInt();
	if(c==1)
	{
		LocalTime orderTime=LocalTime.now();
		System.out.println("Enter restaurant ID ");
		int rid=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter menu name : ");
		String mName=sc.nextLine();
		System.out.println("Enter customer name:");
		String customerName=sc.nextLine();
		
		System.out.println("Enter customer address: ");
		String custAddress=sc.nextLine();
		
		System.out.println("Enter Quantity: ");
		int quantity=sc.nextInt();
		
		int rindex = 0;
		for(int i=0;i<rindex;i++)
		{
			if(restaurants[i].getId()==rid)
			{
				Menu[] menu=restaurants[i].getMenu();
				for(int j=0;j<menu.length;j++)
				{
					if(menu[j].getName().equals(mName))
					{
						amount=menu[j].getPrice();
						totalAmount=amount*quantity;
						LocalTime approaxDeliveryTime=orderTime.plusMinutes(30);
						LocalDate orderDate=LocalDate.now();
						LocalTime approxDeliveryTime = null;
						orders[orderIndex++]=new OrderDetails(orderId,customerName,custAddress,totalAmount,mName,amount,quantity,orderTime,orderDate,approxDeliveryTime,rid);
						orderId++;
						System.out.println("Your order has been placed\n Invoice");
						System.out.println("Menu Item:"+mName+"\nRestaurant ID:"+rid+""+"\nDelivery Address:"+custAddress+"\n Total Bill"+totalAmount+"\nQuantity:"+quantity+"\nApprox Delivery time:"+approaxDeliveryTime);
						
						break;
					}
				}
			}
		}
	}
	else
	{
		UserOperations();
	}
}
protected static void UserOperations() {
	// TODO Auto-generated method stub
	
}
}