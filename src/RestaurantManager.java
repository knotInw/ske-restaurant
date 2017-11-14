import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * SKE-Restaurant with menu file
 * @author Tharittawat Tharasook
 * Student ID : 6010545803
 */

public class RestaurantManager {

	static final String menuFile = "data/Menu.txt";
	
	public static Scanner scan = new Scanner(System.in);
	
	public static LocalDateTime now = LocalDateTime.now();
	
	static ArrayList<String> items = new ArrayList<String>();

	static ArrayList<Double> prices = new ArrayList<Double>();
	
	public static String[] getMenuItems() {
		String[] itemsMenu  = items.toArray(new String[items.size()]);
		return itemsMenu;
	}
	
	public static double[] getPrices() {
		double[] pricesMenu = new double[prices.size()];

		for(int i=0 ; i<pricesMenu.length ; i++) {
			pricesMenu[i] = prices.get(i);
		}
		return pricesMenu;
	}
	
	public static void recordOrder(int orderNumber, int[] order, double total) {
		String[] menuList = getMenuItems();

		String pattern = null;

		int c=0;

		for(String menu : menuList)
		{
			if(order[c] != 0)
			{
				pattern += String.format("|%-18s|%9.0f|\n",menuList[c],order[c]);
			}
			c++;
		}
//		return String.format("Date [ "+now.getDayOfMonth()+" / "+now.getMonthValue()+" / "+now.getYear()+" ]");

		System.out.printf("Date [ %2d / %2d / %4d ]\n"
				+ "Time [ %2d:%2d ]"
				,now.getDayOfMonth(),now.getMonthValue(),now.getYear()
				,now.getHour(),now.getMinute());
	}
	
	static void setMenu(String filename) {
		String item[];
		item = getMenuItems();
		System.out.println(item);
	}
	
	public static void main(String[] args) {	
		
	}

}
