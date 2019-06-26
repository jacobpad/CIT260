import java.util.Scanner; // Allows user input

/**
 * <h1>Jacob Padgett</h1>
 * <h3>Bro Jones <br>
 * CIT 260 <br>
 * DIGITAL COPY OF THE TEXTBOOK <br>
 * Week 8 <br>
 * Assignment 1 & 2</h3>
 * <p>
 * Assignment 1
 * </p>
 * <br>
 * Design a class called RectangularBox. <br>
 * The box contains:
 * <ul>
 * <li>3 integer data fields named width, height, and depth.</li>
 * <li>A no-arg constructor that creates a default rectangle with all sides
 * equal to 1.</li>
 * <li>A constructor that contains 3 parameters that sets the width, height, and
 * depth.</li>
 * <li>A method named getSurfaceArea() that returns an integer of the
 * surfaceArea of the box.</li>
 * <li>A method named getVolume() that returns an integer of the volume of the
 * box.</li>
 * </ul>
 * <br>
 * <p>
 * Assignment 2
 * </p>
 * Use last week's assignment and Create a class called ArrStats (its a pirate
 * class). <br>
 * The ArrStats class contains:
 * <ul>
 * <li>An array of 10 integers</li>
 * <li>A constructor that takes an array containing 10 integers.</li>
 * <li>A method called average that returns a double</li>
 * <li>A method called Minimum that returns an integer.</li>
 * <li>A method called Maximum that returns an integer</li>
 * </ul>
 * <br>
 * Have the main program prompt for the 10 integers to build an array.<br>
 * Then create an instance of the Stats class by passing in the array to the
 * constructor.<br>
 * Finally output the Average, minimum and Maximum of the Array.
 */
public class Chpt9 {
	private static Scanner input;

	/**
	 * <strong>public static void main(String[] args)</strong><br>
	 * This is the main function - it does it's job very well.
	 */
	public static void main(String[] args) {

		input = new Scanner(System.in);

		// INTRODUCE, EXPLAIN AND PROMPT FOR FIRST VALUE - WIDTH
		System.out.print("Welcome. Allow me to help you with some questions you may encounter"
				+ "\nin a math class regarding the surface area and volume of a rectangle. "
				+ "\nBecause, let's face it, surface area and volume of some shape doesn't "
				+ "\nmake for good diner conversation." + "\n\nI'm not very precise, I'm not instructed to be, so... "
				+ "\nPLEASE, use whole numbers only, and no units of measurement." + "\n\nEnter width: ");
		int width = input.nextInt();

		// PROMPT FOR HEIGHT
		System.out.print("Please enter the height: ");
		int height = input.nextInt();

		// PROMPT FOR DEPTH
		System.out.print("And now, enter the depth: ");
		int depth = input.nextInt();

		// CREATE INSTANCE AND PASS THE INPUT
		RectangularBox myBox = new RectangularBox(width, height, depth);

		// DISPLAY THE AREA, FOLLOWED BY VOLUME
		System.out.println("\nAREA: " + myBox.getSurfaceArea(width, height, depth));
		System.out.println("VOLUME: " + myBox.getVolume(width, height, depth));

		// PART 2
		// DECLARE INT ARRAY
		int[] valuesInt = new int[10];

		// PROMPT THE USER TO ENTER 10 INTEGER VALUES AND STORES THEM IN AN INTEGER
		// ARRAY DECLARED ABOVE
		System.out.print("\nSURPRISE, there's a second part to the program."
				+ "\nPlease enter ten positive integer values (whole numbers greater than 0. ie. 8): ");
		for (int i = 0; i < valuesInt.length; i++) {
			valuesInt[i] = input.nextInt();
		}

		// CREATE INSTANCE AND PASS THE INPUT
		ArrStats ArrStats = new ArrStats(valuesInt);
		ArrStats.setAverage();
		ArrStats.setMinimum();
		ArrStats.setMaximum();

		// DISPLAY THE AVERAGE, MINIMUM & MAXIMUM
		System.out.println("Average: " + ArrStats.getAverage());
		System.out.println("Maximum: " + ArrStats.getMaximum());
		System.out.println("Minimum: " + ArrStats.getMinimum());

	}
}
