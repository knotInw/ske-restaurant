import java.util.Scanner;

public class skeRestaurant {
	
	public static int Pizza(int quan1,int total1){
		total1 = quan1*250;
		return total1;
	}
	public static int Chickens(int quan2,int total2){
		total2 = quan2*120;
		return total2;
		}
	public static int Coke(int quan3,int total3){
		total3 = quan3*45;
		return total3;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=0;
		int qty1=0,qty2=0,qty3=0;
		int total1=0,total2=0,total3=0;
		int tot1=0,tot2=0,tot3=0;
		int quan1=0,quan2=0,quan3=0;
		int menu1=0,menu2=0,menu3=0;
		
		System.out.println("--------- Welcome to SKE Restaurant ---------");
		System.out.printf("%-15s 250 Baht.\n","1.) Pizza" );
		System.out.printf("%-15s 120 Baht.\n","2.) Chickens" );
		System.out.printf("%-15s 45 Baht.\n","3.) Coke" );
		System.out.printf("4.) Total\n");
		System.out.printf("5.) Exit\n");
		System.out.println();
		
		do{
			if(a==1){
				
				System.out.printf("Enter your Quantity: ");
				quan1 = scan.nextInt();
				qty1 = quan1+qty1;
				total1 = Pizza(quan1,total1);
				tot1 = total1+tot1;
				menu1 = 1;
				System.out.println();
			}
			else if(a==2){
				System.out.printf("Enter your Quantity: ");
				quan2 = scan.nextInt();
				qty2 = quan2+qty2;
				total2 = Chickens(quan2,total2);
				tot2 = total2+tot2;
				menu2 = 1;
				System.out.println();
			}
			else if(a==3){
				System.out.printf("Enter your Quantity: ");
				quan3 = scan.nextInt();
				qty3 = quan3+qty3;
				total3 = Coke(quan3,total3);
				tot3 = total3+tot3;
				menu3 = 1;
				System.out.println();
			}
			else if(a==4){
				System.out.printf("+---------- Menu ----------+-- Qty --+-- Price --+\n");
					if(menu1==1){
						System.out.printf("| %-24s | %-4s %d  | %-9s |\n","Pizza"," ",qty1,tot1);
					}
					if(menu2==1){
						System.out.printf("| %-24s | %-4s %d  | %-9s |\n","Chickens"," ",qty2,tot2);
					}
					if(menu3==1){
						System.out.printf("| %-24s | %-4s %d  | %-9s |\n","Coke"," ",qty3,tot3);
				}
				System.out.printf("+--------------------------+---------+-----------+\n");
				System.out.printf("| %-34s | %d %-5s |\n","Total",(tot1+tot2+tot3)," ");
				System.out.printf("+--------------------------+---------+-----------+\n");
				System.out.println();
			}
			System.out.printf("Enter your Choice: ");
			a = scan.nextInt();
		}
		while(a!=5);
		System.out.print("===== Thank You =====");
	}
}
