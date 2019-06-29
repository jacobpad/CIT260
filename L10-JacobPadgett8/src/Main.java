/**
 * 
 */

/**
 * @author jacob
 *
 */
import java.util.Scanner;

public class Main {
	public static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		System.out.println("Please provide information about a rectangle");
//		System.out.print("Enter the length: ");
//		double length = input.nextDouble();
		double length = getDouble("Enter the length: ");

//		System.out.print("Enter the width: ");
		double width = getDouble("Enter the width: ");
//input.nextDouble(); ///

		Boolean isFilled = false;
		String filled;
		Boolean firstTime = true;
		do {
			if (!firstTime) {
				System.out.println("Error, please try again. Y or N.");
			}
			firstTime = false;

			filled = getInput("Is it filled(y/n): ");
//			System.out.print("Is it filled (y/n): ");

//			filled = input.nextLine();
			filled = filled.toLowerCase();
			// input.nextLine(); // Needed to solve the ENTER value problem
		} while (!filled.equals("y") && !filled.equals("n")); // End loop
		if (filled.equals("y")) {
			isFilled = true;
		}

//		System.out.print("What color is it? ");
//		String color = input.nextLine();

		String color = getInput("What color is it? ");

		// Build the details
		GeometricObject theDetails = new Rectangle(width, length, isFilled, color);
		System.out.println(theDetails.toString());

//		input.close();
	}

	public static String getInput(String message) {
		System.out.print(message);
		input = new Scanner(System.in);
		String value = ""; // value to be returned
		boolean valid = false; // initialize to not valid
		try {
			while (!valid) { // loop while an invalid value is entered
				value = input.nextLine(); // get next line typed on keyboard
				value = value.trim(); // trim off leading and trailing blanks
				if (value.length() < 1) { // value is blank
					System.out.printf("\nInvalid value: value cannot be blank");
					continue;
				}
				break; // end the loop
			}
		} catch (Exception e) {
			System.out.printf("Error reading input: " + e.getMessage());
		}
		return value; // return the value entered
	}

	public static double getDouble(String message) {
		String teString = getInput(message);
		double test2 = Double.parseDouble(teString);
		return test2;
	}

}
