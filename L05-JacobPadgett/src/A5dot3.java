
/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 5.3
 * Write a program that displays the following table: Kilograms to Pounds
 ****************/

import java.util.Scanner;

public class A5dot3 {

	public static void main(String[] args) {
		System.out.println("This program displays the following table: Kilograms to Pounds. It does so in increments of two.");
		System.out.print("Are you ready? Press any letter (followed by 'Enter') to view: ");

		String show = ask();

		System.out.println("Kilograms\t\tPounds");
		for (int i = 1; i<=199; i+=2) {
			int kilograms = i;
			double pounds = i * 2.2;
			System.out.format(kilograms + "\t\t\t" + "%.1f\n",pounds);
		}

	}
		public static String ask() {
			Scanner input = new Scanner(System.in);
			String show;
			show = input.next();
			return show;
		}
}