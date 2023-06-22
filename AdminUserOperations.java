package orderingsystem;
import java.util.*;
public class AdminUserOperations  {
	 static Scanner sc=new Scanner(System.in);
	 
		static Menu createMenu() {
			System.out.println("Enter Menu id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Menu name:");
			String name=sc.nextLine();
			
			System.out.println("Enter Menu ratings:");
			float rating=sc.nextFloat();
			
			System.out.println("Enter Menu price:");
			double price=sc.nextDouble();
			
		     return new Menu(id,name,rating,price);
		}
		
		static Restaurant createRestaurant() {
			System.out.println("Enter Restaurant id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Restaurant name:");
			String name=sc.nextLine();
			
			System.out.println("Enter Restaurant adress:");
			String adress=sc.nextLine();
			
			return new  Restaurant(id,name,adress);
			
		}
		static void getMenuObject() {
			
		}
		
		static void adminOperations() {
			int choice;
			while(true) {
			System.out.println("Press 1. Add menu\nPress 2. Update menu\n"
			+"Press 3. Deactivate Menu\nPress 4. To get oder details\n"
					+"Press 5. Add resturant for menu\n"
					+"Press 6. Get all menu details\n"
					+"Press 7. Get all restauarant details\n"
					+"Press 8. Assign Restaurant to menus\n"
					+"Press 8. To get back to the main menu");
			
			System.out.println("----x----x----");
			System.out.println("Enter your choice!!");
			System.out.println("----x----x----");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				Menu m=createMenu();
				MenuService.addmenu(m);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				Restaurant r=createRestaurant();
				RestaurantService.addRestaurant(r);
				break;
			case 6:
				MenuService.getAllMenus();
			    break;
			case 7:
				RestaurantService.getAllRestaurant();
				break;
			case 8:
				
			case 9:
				MainMenu.allMenus();;
			}
			}
		}
	}
