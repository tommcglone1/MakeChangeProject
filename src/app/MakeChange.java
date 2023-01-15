package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
			System.err.println("Amount tendered does not cover cost of item." + " Please provide sufficient amount.");
		}

		else if (itemPrice % tendered == 0) {
			System.out.println("Exact amount tendered. No change required.");
		}

		else if (itemPrice < tendered) {
			change = (tendered - itemPrice);
			dollars = (int) (change);

			twenties = dollars / 20;

			if (twenties <= 0) {
				System.out.print("");
			}
			if (twenties == 1) {
				System.out.print(twenties + " twenty dollar bill, ");
			}
			if (twenties > 1) {
				System.out.print(twenties + " twenty dollar bills, ");
			}

			tens = dollars % 20 / 10;

			if (tens <= 0) {
				System.out.print("");
			}
			if (tens == 1) {
				System.out.print(tens + " ten dollar bill, ");
			}
			if (tens > 1) {
				System.out.print(tens + " ten dollar bills, ");
			}

			fives = dollars % 20 % 10 / 5;

			if (fives <= 0) {
				System.out.print("");
			}
			if (fives == 1) {
				System.out.print(fives + " five dollar bill, ");
			}
			if (fives > 1) {
				System.out.print(fives + "five dollar bills, ");
			}

			ones = dollars % 20 % 10 % 5 / 1;

			if (ones <= 0) {
				System.out.print("");
			}
			if (ones == 1) {
				System.out.print(ones + " one dollar bill, ");
			}
			if (ones > 1) {
				System.out.print(ones + " one dollar bills, ");
			}

			cents = change - dollars;

			double dot25 = cents / .25;
			quarters = (int) dot25;

			if (quarters <= 0) {
				System.out.print("");
			}
			if (quarters == 1) {
				System.out.print(quarters + " quarter, ");
			}
			if (quarters > 1) {
				System.out.print(quarters + " quarters, ");
			}

			double dot10 = cents % .25 / .10;
			dimes = (int) dot10;
			if (dimes <= 0) {
				System.out.print("");
			}
			if (dimes == 1) {
				System.out.print(dimes + " dime, ");
			}
			if (dimes > 1) {
				System.out.print(dimes + " dimes, ");
			}

			double dot5 = cents % .25 % .10 / .05;
			nickels = (int) dot5;
			if (nickels <= 0) {
				System.out.print("");
			}
			if (nickels == 1) {
				System.out.print(nickels + " nickle, ");
			}
			if (nickels > 1) {
				System.out.print(ones + " nickels, ");
			}

			double dot1 = cents % .25 % .10 % .05 / .01;
			dot1 = (dot1 + .005);
			pennies = (int) dot1;
			if (pennies <= 0) {
				System.out.print("");
			}
			if (pennies == 1) {
				System.out.print(pennies + " penny. ");
			}
			if (pennies > 1) {
				System.out.print(pennies + " pennies. ");
			}
		}
		sc.close();
	}
}
