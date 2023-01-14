package app;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double itemPrice;
		double tendered;
		double change;
		
		System.out.print("Enter the price of the item to be purchased: ");
		itemPrice = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter the amount tendered by the customer: ");
		tendered = sc.nextDouble();
		sc.nextLine();
		
			if (itemPrice > tendered) {
				System.err.println("Amount tendered does not cover cost of item." +
									" Please provide sufficient amount.");
			}
			
			else if (itemPrice % tendered == 0) {
				System.out.println("Exact amount tendered. No change required.");
			}
			
			else if (itemPrice < tendered) {
				change = tendered - itemPrice;
				
				System.out.println(change);
			}
			
		
	}

}
// itemPrice = 15 tendered = 20 result is 5 change.
// price 13.10 tendered 14 3 quarters 1 dime 1 nickel.
// price 6.37 tendered 10 3 one dollar bills, 3 pennies,  2 quarters one dime 