package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double amountGiven;
		double cashBack;
		double amountItem;

		System.out.println("How much is the item?");
		amountItem = keyboard.nextDouble();

		System.out.println("How much will you be paying?");
		amountGiven = keyboard.nextDouble();

		cashBack = amountGiven - amountItem;

		if (cashBack == 0) {
			System.out.println("No change due, thanks have a nice day");
		} else if (cashBack < 0) {
			System.out.println("The amount is not enough to cover the cost");
		} else {
			System.out.println("Your change is:");
			figureCashBreakDown(cashBack);
		}
		keyboard.close();
	}

	public static void figureCashBreakDown(double cashBack) {
		int pennies = (int) Math.round(cashBack * 100);
		int twenties = pennies / 2000;
		if (twenties > 0) {
			if (twenties == 1) {
				System.out.println(twenties + " twenty dollar bill ");
			} else {
				System.out.println(twenties + " twenty dollar bills ");
			}
			pennies = pennies % 2000;

		}
		int tens = pennies / 1000;
		if (tens > 0) {
			if (tens == 1) {
				System.out.println(tens + " ten dollar bill");
			} else {
				System.out.println(tens + " ten dollar bills");
			}
			pennies = pennies % 1000;
		}

		int fives = pennies / 500;
		if (fives > 0) {
			if (fives == 1) {
				System.out.println(fives + " five dollar bill");
			} else {
				System.out.println(fives + " five dollar bills");
			}
			pennies = pennies % 500;
		}

		int ones = pennies / 100;
		if (ones > 0) {
			if (ones == 1) {
				System.out.println(ones + " one dollar bill");
			} else {
				System.out.println(ones + " one dollar bills");
			}
			pennies = pennies % 100;

		}
		int quarters = pennies / 25;
		if (quarters > 0) {
			if (quarters == 1) {
				System.out.println(quarters + " quarter");
			} else {
				System.out.println(quarters + " quarters ");
			}
			pennies = pennies % 25;
		}
		int dimes = pennies / 10;
		if (dimes > 0) {
			if (dimes == 1) {
				System.out.println(dimes + " dime");
			} else {
				System.out.println(dimes + " dimes ");
			}
			pennies = pennies % 10;
		}
		int nickels = pennies / 5;
		if (nickels > 0) {
			if (nickels == 1) {
				System.out.println(nickels + " nickel");
			} else {
				System.out.println(nickels + " nickles");
			}
			pennies = pennies % 5;
		}

		if (pennies == 1) {
			System.out.println(pennies + " penny");
		} else if (pennies < 1) {
			System.out.println();
		} else {
			System.out.println(pennies + " pennies ");
		}

	}
}
