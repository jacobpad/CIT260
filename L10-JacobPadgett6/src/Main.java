/**
 * 
 */

/**
 * @author jacob
 *
 */
import java.util.Scanner;

public class Main {

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
		} while ((filled != "y") && (filled != "n")); // End loop
		if (filled == "y") {
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
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		String teString = input.nextLine();
		input.close();
		return teString;
	}

	public static double getDouble(String message) {
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		double test2 = input.nextDouble();
		input.close();
		return test2;
	}

}
