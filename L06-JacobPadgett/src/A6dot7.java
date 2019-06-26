/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 6.7
 * Write a program that prompts the user for an investment 
 * amount and interest rate and prints a table that displays 
 * future values from years 1 to 30.
 ****************/

import java.util.Scanner;

public class A6dot7 {
	//DRIVER
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// INTRODUCTION
		System.out.println("This is an investment program.\n");
		
		// GET $ TO INVEST
		System.out.print("The amount invested: ");
		double amountInvested = input.nextDouble();
		
		// GET INVESTMENT RATE
		System.out.print("Annual interest rate (ie. 7.4 = 7.4%): ");
		double interestRate = input.nextDouble();
		
		// MONTHLY INTEREST RATE
		double monthlyInterestRate = interestRate / 1200;

		// INVESTMENT LENGTH OF TIME
		// System.out.print("Length of investment in whole years? ");
		int interestYears = 30; // = input.nextInt()

		// DISPLAY & INVOKE THE MATH CALL
		System.out.print("\nYears\t\tFuture Value ($)"); 
		for (int years = 1; years <= interestYears; years++) {
			System.out.printf("\n" +  years + "\t\t\t   %8.2f", futureInvestmentValue(amountInvested, monthlyInterestRate, years));
		}

	}
	
	/***************
	 * THIS IS REQUIRED PER THE ASSIGNMENT INSTRUCTIONS
	 * IT DOES THE MATH
	 ***************/
	public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years ) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
