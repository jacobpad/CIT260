import java.util.Scanner;

public class ArrStats {
	private static Scanner input;

	// DECLARE INT ARRAY
	private int[] valuesInt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public ArrStats() {
		input = new Scanner(System.in);
		// PROMPT THE USER TO ENTER 10 INTEGER VALUES AND STORES THEM IN AN INTEGER
		// ARRAY DECLARED ABOVE
		System.out.print("\nPlease enter ten positive integer values (whole numbers greater than 0. ie. 8): ");
		for (int i = 0; i < valuesInt.length; i++) {
			valuesInt[i] = input.nextInt();
		}
	}

	/**
	 * @param valuesInt
	 */
	public ArrStats(int[] valuesInt) {
		super();
		this.valuesInt = valuesInt;
	}

	/**
	 * @return the valuesInt
	 */
	public int[] getValuesInt() {
		return valuesInt;
	}

	/**
	 * @param valuesInt the valuesInt to set
	 */
	public void setValuesInt(int[] valuesInt) {
		this.valuesInt = valuesInt;
	}

	/****************
	 * <h1>Average The Int</h1>
	 * <h2>public static int Average(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the average of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (int)average / array.length
	 ****************/
	public static int Average(int[] valuesInt) {
		int average = 0;
		for (int i : valuesInt)
			average += i;
		return average / valuesInt.length;
	}

	/****************
	 * <h1>Find Int Minimum</h1>
	 * <h2>public static int min(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the minimum of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (int)minimum
	 ****************/
	public static int min(int[] valuesInt) {
		int minimum = valuesInt[0];
		int maximum = valuesInt[0];
		for (int i = 0; i <= valuesInt.length - 1; i++) {
			if (valuesInt[i] < minimum)
				minimum = valuesInt[i];
			if (valuesInt[i] > maximum)
				maximum = valuesInt[i];
		}
		return minimum;
	}

	/****************
	 * <h1>Find Int Maximum</h1>
	 * <h2>public static int max(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the maximum of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (int)average / array.length
	 ****************/
	public static int max(int[] valuesInt) {
		int minimum = valuesInt[0];
		int maximum = valuesInt[0];
		for (int i = 0; i <= valuesInt.length - 1; i++) {
			if (valuesInt[i] < minimum)
				minimum = valuesInt[i];
			if (valuesInt[i] > maximum)
				maximum = valuesInt[i];
		}
		return maximum;
	}
}