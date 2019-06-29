/**
 * <h1>Jacob Padgett</h1>
 * <h2>Brother Jones</h2>
 * <h2>Week 10</h2>
 * <p>CIT 260</p>
 */

/**
 * @author jacob
 *
 */
import java.util.Scanner;

/**
 * @author jacob Main Method That drives the program
 */
public class Main {
	public static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please provide information about a rectangle");
		double length = getDouble("Enter the length: ");

		double width = getDouble("Enter the width: ");

		Boolean isFilled = false;
		Boolean firstTime = true;
		String filled;
		do {
			if (!firstTime) {
				System.out.println("Error, please try again. Y or N.");
			}
			firstTime = false;

			filled = getInput("Is it filled(y/n): ");

			filled = filled.toLowerCase();
		} while (!filled.equals("y") && !filled.equals("n")); // End loop
		if (filled.equals("y")) {
			isFilled = true;
		}

		String color = getInput("What color is it? ");

		// Build the details
		GeometricObject theDetails = new Rectangle(width, length, isFilled, color);
		System.out.println(theDetails.toString());

	}

	/**
	 * public static String getInput(String message) allows the programmer to
	 * establish a variable and then set its value to the users input
	 * 
	 * @param message
	 * @return
	 */
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

	/**
	 * public static double getDouble(String message)
	 * 
	 * @param message
	 * @return
	 */
	public static double getDouble(String message) {
		String teString = getInput(message);
		double test2 = Double.parseDouble(teString);
		return test2;
	}

}
