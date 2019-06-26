
/****************
 * Jacob Padgett
 * Bro Jones
 * CIT 260
 * 
 * DIGITAL COPY OF THE TEXTBOOK
 * 
 * Assignment 6.8
 * Write a program that contains two methods for converting C* to F*
 ****************/

import java.util.Scanner;

public class A6dot8 {
	// DRIVER METHOD
	public static void main(String[] args) {
		
		//WHY DO THEY HAVE US RECREATE SUCH AN UGLY FORMATED TABLE? WHO KNOWS!
		
		System.out.println(
				"       Celsius        Fahrenheit           |       Fahrenheit                    Celsius\n" +
				"------------------------------------------------------------------------------------------------");
			// DISPLAY
			for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
				System.out.format("%-35.1f", celsius);
				System.out.format("%5.1f   |", celsiusToFahrenheit(celsius));
				System.out.format("                    %5.1f", fahrenheit);
				System.out.format("                    %7.2f\n", fahrenheitToCelsius(fahrenheit));
			}
		}

	// CONVERT FROM CELSIUS TO FAHRENHEIT
	public static double celsiusToFahrenheit(double c) {
		double f;
		f = (c * 9 / 5) + 32;
		return f;
	}
	
	// CONVERT FROM FAHRENHEIT TO CELSIUS
	public static double fahrenheitToCelsius(double f) {
		double c;
		c = (f - 32) * 5 / 9;
		return c;
	}
}

	
	
	
	
	
	
	
//  // FOR FUN, THIS COULD BE SWAPED TO MAKE IT A PROMPT BASED ASKING	
//	// DRIVER METHOD
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		int again;
//		do {
//
//			int choiceOfConvertion;
//
//			// DO WHILE LOOP TO GET CHOICE FOR CONVERSTION
//			do {
//
//				// GET CHOICE OF CONVERSION
//				System.out.println("This is a(nother) program that converts tempatures.\n");
//				System.out.println("What would you like to convert?\n"
//						+ "\tPress 1 (followed by Enter or Return) to convert celsius to Fahrenheit.\n"
//						+ "\tPress 2 (followed by Enter or Return) to convert Fahrenheit to Celsius.\n"
//						+ "\tPress 0 (followed by Enter or Return) to cancel.");
//
//				System.out.print("I choose: ");
//				choiceOfConvertion = input.nextInt();
//				if(choiceOfConvertion != 1 && choiceOfConvertion != 2) {
//					if(choiceOfConvertion == 0) {
//						System.out.println("exit successful");
//						return;
//					}
//					System.out.println("Error, invalid entry.");
//				}
//			} while (choiceOfConvertion != 1 && choiceOfConvertion != 2);
//
//			// GET TEMP
//			System.out.print(/*"You chose " + choiceOfConvertion + ".\n" +*/ "Please enter your tempature to convert: ");
//			double receivedTemp = input.nextDouble();
//
//			// SEND THE TEMP FOR CONVERSION AND DISPLAY
//			if (choiceOfConvertion == 1) {
//				double convertedTempCtoF = celsiusToFahrenheit(receivedTemp);
//				System.out.println("\nYour converted tempature of " + receivedTemp + " degrees celsius " + "is "
//						+ convertedTempCtoF + " fahrenheit.");
//			} else {
//				double convertedTempFtoC = fahrenheitToCelsius(receivedTemp);
//				System.out.println("\nYour converted tempature of " + receivedTemp + " degrees faherenheit " + "is "
//						+ convertedTempFtoC + " celsius.");
//			}
//			;
//			System.out.println("\nWould you like to do it again?\n" 
//			+ "3 = yes\n" 
//			+ "anything else = no\n" 
//			+ "I choose: ");
//			again = input.nextInt();
//
//		} while (again == 3);
//	};

