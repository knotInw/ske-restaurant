/*
 * SKE Restaurant with Array
 * @Author Tharittawat Tharasook
 * Student ID : 6010545803
 */

import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDateTime;

public class skeRestaurantArrays {
	public static Scanner scan = new Scanner(System.in);
	
	public static LocalDateTime now = LocalDateTime.now();
			
	public static int totalPricePizza(int quan){
		int total = quan*250;
		return total;
	}
	
	public static int totalPriceChickens(int quan){
		int total = quan*120;
		return total;
	}
	
	public static int totalPriceCoke(int quan){
		int total = quan*45;
		return total;
	}
	
	public static void printReceipt(){
		System.out.print("====================================\n");
		System.out.printf("%30.30s\n","SKE Vegetarian Restaurant");
		System.out.printf("%7.30s %te %tb %tY,%tT\n","",now,now,now,now);
		System.out.printf("%s: %d\n\n","Order",101);
		
		for(int i=0 ; i<quan.length ; i++){
			if(quan[i]!=0){
			System.out.printf("%3d %-10s %5.0fea %10.2f\n",quan[i],menuItems[i],prices[i],total[i]);
			sumTotal = sumTotal + total[i];
			}
		}
		
		System.out.printf("  Total %25.2f\n",sumTotal);
	}
	
	public static void choicePrint(){
		for(int i=0 ; i<menuItems.length ; i++){
			 System.out.printf(" [%d] %-20.20s  %.2f\n", i+1, menuItems[i], prices[i]);
		}
		System.out.println();
		System.out.printf(" [e] Edit order\n"
						 +" [p] Print order\n"
						 +" [c] Review order and Checkout\n"
						 +" [x] Cancel order\n");
		System.out.println();
	}
	
	public static void menuList(){
		do{
			if(menu.equals("1")){
				System.out.print(" Enter your Quantity: ");
				quan[0] = scan.nextInt();
				total[0] = totalPricePizza(quan[0]);
			}
			
			else if(menu.equals("2")){
				System.out.print(" Enter your Quantity: ");
				quan[1] = scan.nextInt();
				total[1] = totalPriceChickens(quan[1]);
			}
			
			else if(menu.equals("3")){
				System.out.print(" Enter your Quantity: ");
				quan[2] = scan.nextInt();
				total[2] = totalPriceCoke(quan[2]);
			}
			
			else if(menu.equalsIgnoreCase("e")){
				System.out.println("\nEnter your edit order");
				choicePrint();
			}
			
			else if(menu.equalsIgnoreCase("p")){
				printReceipt();
			}
			
			else if(menu.equalsIgnoreCase("c")){
				printReceipt();
				break;
			}
			
			System.out.print(" Input Choice: ");
			menu = scan.next();
		}
		while(!menu.equalsIgnoreCase("x"));
	}

	public static String menu="";
	
	public static String menuItems[] = {"Pizza","Chickens","Coke"};
	public static double prices[] = {250,120,45};
	public static int quan[] = {0,0,0};
	public static double total[] = {0,0,0};
	public static double sumTotal;

	public static void main(String[] args) {
		
		System.out.println("--------- Welcome to SKE Restaurant ---------");
		choicePrint();
		menuList();	
		System.out.print("============= Thank You ============");
	}

}