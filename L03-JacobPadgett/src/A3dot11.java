/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 3.11
 * Leap Year info taken from https://en.wikipedia.org/wiki/Leap_year
 ****************/

import java.util.Scanner;
public class A3dot11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's figure how many days are in any month of any year. Maybe you'll find a leap year. Give it a try.\n");
		
		// Promp for month
		System.out.print("Enter a month number (1-12): ");
		int monthInput = input.nextInt();	
		
		// Prompt for year
		System.out.print("Enter a year (example 1830): ");
		int yearInput = input.nextInt();
		
		// Calculate month
		String monthString = "";

		switch (monthInput) {
		case 1:  monthString = "January";  break;
		case 2:  monthString = "February"; break;
		case 3:  monthString = "March";    break;
		case 4:  monthString = "April";    break;
		case 5:  monthString = "May";      break;
		case 6:  monthString = "June";     break;
		case 7:  monthString = "July";     break;
		case 8:  monthString = "August";   break;
		case 9:  monthString = "September";break;
		case 10: monthString = "October";  break;
		case 11: monthString = "November"; break;
		case 12: monthString = "December"; break;
		default: System.out.println("Something boke");break;
		}
			
		int daysInMonth28 = 28;
		int daysInMonth29 = 29;
		int daysInMonth30 = 30;
		int daysInMonth31 = 31;
		
		/************** 
		 * if (year is not divisible by 4) then (it is a common year)
		 * else if (year is not divisible by 100) then (it is a leap year)
		 * else if (year is not divisible by 400) then (it is a common year)
		 * else (it is a leap year) 
	     **************/
		
		if(yearInput % 4 != 0 && monthString == "February") {
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth28 + " days.");
			
		}else if(yearInput % 100 != 0 && monthString == "February") {
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth29 + " days. It's a leap year!");
			
		}else if(yearInput % 400 != 0 && monthString == "February") {
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth28 + " days. Common 400 year!");

		}else if(monthString == "February"){
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth29 + " days. Leap year!");
			//System.out.println("");
		}else if(monthString == "April" || monthString == "June" || monthString == "September" || monthString == "November") {
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth30 + " days.");
		}else {
			System.out.println(monthString + " " + yearInput + " has " + daysInMonth31 + " days.");
		}
}

}
