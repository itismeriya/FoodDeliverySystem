package orderingsystem;
import static orderingsystem.AdminUserOperations.*;
import java.util.*;
public class MainMenu {
static Scanner sc=new Scanner(System.in);

	public static void allMenus() {
		int choice;
		while(true) {
		System.out.println("Press 1. Admin panel\npress 2. User panel\n"+
		             "press 3. To quit");
	
		System.out.println("----x----x----");
		System.out.println("Enter your choice!!");
		System.out.println("----x----x----");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			adminOperations();
			break;
		case 2:
			break;
		case 3:
		  System.exit(0);
		}
		}
	}
	
	public static void main(String[]args) {
		System.out.println("Welcome to Food odering system~~");
		allMenus();
	}


}
