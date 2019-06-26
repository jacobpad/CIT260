 /**
 * Jacob Padgett
 * Bro Jones
 * CIT 260 
 * DIGITAL COPY OF THE TEXTBOOK 
 * Week 7 Assignment 
 * <ul><li>Name your class file A7</li>
 * <li>Place the folders for these projects into a single zip folder.</li>
 * <li>Submit the zip folder before the due date.</li></ul>
 */
import java.util.Scanner; // Allows user input
public class A7 {

	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		//******************** INTRODUCE PROGRAM PART 1 ********************/
		System.out.println("Part 1 of 2\nUpon following the requests of the program, "
				+ "it will display the \n\taverage \n\tminimum \n\tmaximum \nof the "
				+ "positive whole numbers entered");
		
		// DECLARE INT ARRAY
		int[] valuesInt = new int[10];
		
		// PROMPT THE USER TO ENTER 10 INTEGER VALUES AND STORES THEM IN AN INTEGER ARRAY DECLARED ABOVE
		System.out.print("\nPlease enter ten positive integer values (whole numbers greater than 0. ie. 8): ");
		for (int i = 0; i < valuesInt.length; i++) {
			valuesInt[i] = input.nextInt();
		}
		
		// CALL AND DISPLAY THE AVERAGE METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Average: %.2f\n", Average(valuesInt));
		
		// CALL AND DISPLAY THE MINIMUM METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Minimum: %.2f\n", min(valuesInt));
		
		// CALL AND DISPLAY THE MAXIMUM METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Maximum: %.2f\n", max(valuesInt));

		//******************** INTRODUCE PROGRAM PART 2 ********************/
		System.out.println("\nPart 2 of 2\nUpon following the requests of the program," 
				+ "it will display the \n\taverage \n\tminimum \n\tmaximum \nof the "
				+ "positive numbers with decimals entered");
		
		// DECLARE INT ARRAY
		double[] valuesDouble = new double[10];
		
		// PROMPT THE USER TO ENTER 10 DOUBLE VALUES AND STORES THEM IN A DOUBLE ARRAY DECLARED ABOVE
		System.out.print("\nNow enter ten positive double values (numbers with decimals. ie. 9.7): ");
		for (int i = 0; i < valuesDouble.length; i++) {
			valuesDouble[i] = input.nextDouble();
		}

		// CALL AND DISPLAY THE AVERAGE METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Average: %.2f\n", Average(valuesDouble));
		
		// CALL AND DISPLAY THE MINIMUM METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Minimum: %.2f\n", min(valuesDouble));
		
		// CALL AND DISPLAY THE MAXIMUM METHOD WHILE PASSING THE USERS INPUT AS PARAMETERS
		System.out.format("Maximum: %.2f\n", max(valuesDouble));

	}
	
	/****************
	 * <h1>Average The Int</h1>
	 * <h2>public static double Average(int [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the average
	 *  of the 10 integers provided by the user.
	 * @param array - Comes from user input
	 * @return (double)average / array.length
	 ****************/
	public static double Average(int [] array) {
		int average = 0; 
		for (int i: array)
			average += i;
		return (double)average / array.length;
	}
	
	/****************
	 * <h1>Find Int Minimum</h1>
	 * <h2>public static double min(int [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the minimum
	 *  of the 10 integers provided by the user.
	 * @param array - Comes from user input
	 * @return (double)minimum
	 ****************/
	public static double min(int [] array) {
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i <= array.length -1; i++) {
			if (array[i] < minimum) minimum = array[i];
			if (array[i] > maximum) maximum = array[i];
		}
		return (double)minimum;
	}
	
	/****************
	 * <h1>Find Int Maximum</h1>
	 * <h2>public static double max(int [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the maximum 
	 * of the 10 integers provided by the user.
	 * @param array - Comes from user input
	 * @return (double)average / array.length
	 ****************/
	public static double max(int [] array) {
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i <= array.length -1; i++) {
			if (array[i] < minimum) minimum = array[i];
			if (array[i] > maximum) maximum = array[i];
		}
		return (double)maximum;
	}
	
	/****************
	 * <h1>Find Double Average</h1>
	 * <h2>public static double min(double [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the average 
	 * of the 10 doubles provided by the user.
	 * @param array - Comes from user input
	 * @return average
	 ****************/
	public static double Average(double[] array) {
		double average = 0; 
		for (double i: array)
			average += i;
		return average / array.length;
	}
	
	/****************
	 * <h1>Find Double Minimum</h1>
	 * <h2>public static double min(double [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the minimum 
	 * of the 10 doubles provided by the user.
	 * @param array - Comes from user input
	 * @return minimum
	 ****************/
	public static double min(double [] array) {
		double minimum = array[0];
		double maximum = array[0];
		for (int i = 0; i <= array.length -1; i++) {
			if (array[i] < minimum) minimum = array[i];
			if (array[i] > maximum) maximum = array[i];
		}
		return minimum;
	}
	
	/****************
	 * <h1>Find Double Maximum</h1>
	 * <h2>public static double max(double [] array)</h2>
	 * <p><strong>Purpose: </strong></p>Takes in the array and finds the maximum
	 *  of the 10 doubles provided by the user.
	 * @param array - Comes from user input
	 * @return maximum
	 ****************/
	public static double max(double [] array) {
		double minimum = array[0];
		double maximum = array[0];
		for (int i = 0; i <= array.length -1; i++) {
			if (array[i] < minimum) minimum = array[i];
			if (array[i] > maximum) maximum = array[i];
		}
		return maximum;
	}
}
