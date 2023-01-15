package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double itemPrice; double tendered; double change; double cents;
		int dollars, twenties, tens, fives, ones;
		int quarters, dimes, nickels, pennies; 

		System.out.print("Enter the price of the item to be purchased: ");
		itemPrice = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter the amount tendered by the customer: ");
		tendered = sc.nextDouble();
		sc.nextLine();
		
		lessAndEqual(itemPrice, tendered);
		

		if (itemPrice < tendered) {
			change = (tendered - itemPrice);
			dollars = (int) (change);
			
			twenties = dollars / 20;
			twentiesOptions (twenties);

			tens = dollars % 20 / 10;
			tensOptions(tens);
			

			fives = dollars % 20 % 10 / 5;
			fivesOptions(fives);

			
			ones = dollars % 20 % 10 % 5 / 1;
			onesOptions(ones);
			
			cents = change - dollars;

			double dot25 = cents / .25;
			quarters = (int) dot25;
			quartersOptions(quarters);


			double dot10 = cents % .25 / .10;
			dimes = (int) dot10;
			dimesOptions(dimes);
			
			
			double dot5 = cents % .25 % .10 / .05;
			nickels = (int) dot5;
			nickelsOptions(nickels);

			double dot1 = cents % .25 % .10 % .05 / .01;
			dot1 = (dot1 + .005);
			pennies = (int) dot1;
			penniesOptions(pennies);
		
		
		}
		sc.close();
	}


	public static void penniesOptions(int $pennies) {
		if ($pennies <= 0) {
			System.out.print("");
		}
		else if ($pennies == 1) {
			System.out.print($pennies + " penny. ");
		}
		else {
			System.out.print($pennies + " pennies. ");
		}		
	}


	public static void nickelsOptions(int $nickels) {
		if ($nickels <= 0) {
			System.out.print("");
		}
		else if ($nickels == 1) {
			System.out.print($nickels + " nickle, ");
		}
		else {
			System.out.print($nickels + " nickels, ");
		}
	}


	public static void dimesOptions(int $dimes) {
		if ($dimes <= 0) {
			System.out.print("");
		}
		else if ($dimes == 1) {
			System.out.print($dimes + " dime, ");
		}
		else {
			System.out.print($dimes + " dimes, ");
		}

	}


	public static void quartersOptions(int $quarters) {
		if ($quarters <= 0) {
			System.out.print("");
		}
		else if ($quarters == 1) {
			System.out.print($quarters + " quarter, ");
		}
		else {
			System.out.print($quarters + " quarters, ");
		}		
	}


	public static void onesOptions(int $1) {
		if ($1 <= 0) {
			System.out.print("");
		}
		else if ($1 == 1) {
			System.out.print($1 + " one dollar bill, ");
		}
		else  {
			System.out.print($1 + " one dollar bills, ");
		}

	}


	public static void fivesOptions(int $5) {
		if ($5 <= 0) {
			System.out.print("");
		}
		else if ($5 == 1) {
			System.out.print($5 + " five dollar bill, ");
		}
		else {
			System.out.print($5 + "five dollar bills, ");
		}
		
	}


	public static void tensOptions(int $10) {
		if ($10 <= 0) {
			System.out.print("");
		}
		else if ($10 == 1) {
			System.out.print($10 + " ten dollar bill, ");
		}
		else {
			System.out.print($10 + " ten dollar bills, ");
		}
	}


	public static void twentiesOptions(int $20) {
		

		if ($20 <= 0) {
			System.out.print("");
		}
		else if ($20 == 1) {
			System.out.print($20 + " twenty dollar bill, ");
		}
		else {
			System.out.print($20 + " twenty dollar bills, ");
		}

	}


	public static void lessAndEqual(double price, double customerTender) {
		if (price > customerTender) {
			System.err.println("Amount tendered does not cover cost of item." + " Please provide sufficient amount.");
		}

		else if (price % customerTender == 0) {
			System.out.println("Exact amount tendered. No change required.");
		}

	}
	

	
	
	
	
	
	
	
	
	
}