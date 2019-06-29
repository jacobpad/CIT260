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
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide information about a rectangle");
		System.out.print("Enter the length: ");
		double length = input.nextDouble();

		System.out.print("Enter the width: ");
		double width = input.nextDouble();

		System.out.print("Is it filled (type TRUE for yes, or FALSE for no): ");
		boolean filled = input.nextBoolean();
		input.nextLine(); // Needed to solve the ENTER value problem
		String isFilledString = "";
		if (filled) {
			isFilledString = "filled";
		} else {
			isFilledString = "not filled";
		}

		System.out.print("What color is it? ");
		String color = input.nextLine();

		System.out.println(
				"\nYour " + color + " rectangle is " + length + " x " + width + " and is " + isFilledString + ".");

		// Build the area object
		GeometricObject area = new GeometricObject();
		double recArea = area.getArea(width, length);
		System.out.println("Area: " + recArea);

		// Build the Perimeter object
		GeometricObject perimeter = new GeometricObject();
		double recPerimeter = perimeter.GetPerimeter(width, length);
		System.out.println("Perimeter: " + recPerimeter);

	}

}
