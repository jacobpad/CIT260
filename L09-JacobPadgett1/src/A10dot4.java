
/**
 * @author jacob
 * <h1>Jacob Padgett</h1>
 * <h3>Bro Jones <br>
 * CIT 260 <br>
 * DIGITAL COPY OF THE TEXTBOOK <br>
 * Week 9 <br></h3>
 */
import java.util.Scanner;

public class A10dot4 {

	private static Scanner input;

	/**
	 * Main driver method - displays and receives important messages vital to the
	 * functionality of the program.
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);

		// Explain program
		System.out.println("" + "Hi! In this program, you'll give me two points of a graph. "
				+ "\nThink like battleship (C,4 - HIT!) except both coordinates will be \nnumbers, "
				+ "no letters. And I'll return the distance between those two points.");

		// Get input from user
		System.out.println("Input the x, y coordinate seperated by a space. (ie. 9 11.2)");
		System.out.print("First coordinate: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Second coordinate: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Pass input to MyPoint
		// MyPoint point1 = new MyPoint(x1, y1);
		// MyPoint point2 = new MyPoint(x2, y2);

		// Something happened and this seemed to work better. Perhaps you could explain
		// all the extra steps to make it a harder process?
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: "
				+ Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}

}

// Week video start at 15 minutes