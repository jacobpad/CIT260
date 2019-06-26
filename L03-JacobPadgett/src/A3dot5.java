/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * Assignment 3.5
 ****************/

import java.util.Scanner;
public class A3dot5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Here you will input the current (or not) day of the week.\n"
				+ "Then enter any number of elapsed days to see what the new current day would be.\n");
				
		// Prompt user for numerical day
		System.out.print("Enter today's day (number 0-6... 0 for Sunday, 1 for Monday...): ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int eplasedDays = input.nextInt();

		// Calculate
		// Take int today (what the user inputed) and turn it into a day of the week.
		String dayString = "";
		switch (today) {
		case 0: dayString = "Sunday";    break;
		case 1: dayString = "Monday";    break;
		case 2: dayString = "Tuesday";   break;
		case 3: dayString = "Wednesday"; break;
		case 4: dayString = "Thursday";  break;
		case 5: dayString = "Friday";    break;
		case 6: dayString = "Saturday";  break;
		default: System.out.println("Please enter between 0 and 6 for a day of the week.");
		}		
		
		int futureDay = (today + eplasedDays) % 7;
		
		String futureDayString = "";
		// Take int eplasedDays (what the user inputed) and add today and turn it into a day of the week.
		switch (futureDay) {
		case 0: futureDayString = "Sunday";    break;
		case 1: futureDayString = "Monday";    break;
		case 2: futureDayString = "Tuesday";   break;
		case 3: futureDayString = "Wednesday"; break;
		case 4: futureDayString = "Thursday";  break;
		case 5: futureDayString = "Friday";    break;
		case 6: futureDayString = "Saturday";  break;
		default: System.out.println("Impossible");
		}
		
		// Display
		System.out.println("Today is " + dayString + " and the future day is " + futureDayString + ".");
	}
}