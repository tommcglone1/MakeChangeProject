package app;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double itemPrice;
		double tendered;
		double change;
		double cents;
		int dollars;
		int quarters, dimes, nickels, pennies; 
		int twenties, tens, fives, ones;
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
				change = (tendered - itemPrice);
				dollars = (int) (change);
						twenties = dollars / 20;
						tens = dollars % 20 /10;
						fives = dollars % 20 % 10 / 5;
						ones= dollars % 20 % 10 % 5 /1;
						cents = change - dollars;
				System.out.println(twenties + " " +tens + " " + " "  + fives+ ones);		
//				 Need if statements so that these do not print zeros for unneeded denominations
				
				
				double dot25 = cents / .25;
				quarters = (int) dot25;
				double  dot10= cents % .25 / .10;
				dimes = (int) dot10;
				double dot5 = cents % .25 % .10 /.05;
				nickels = (int) dot5;
				double dot1 = cents % .25 % .10 % .05 / .01;
				pennies = (int) dot1;
				
				System.out.println(quarters + " "+ dimes+ " " +" "+ nickels+ " "+ pennies);
				
			}
			
	
			sc.close();
	}
	

}
