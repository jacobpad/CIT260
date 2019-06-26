public class ArrStats {

	private int[] myArray;
	private int average;
	private int maximum;
	private int minimum;

	/**
	 * @param myArray
	 * @param average
	 * @param maximum
	 * @param minimum
	 */
	public ArrStats(int[] myArray, int average, int maximum, int minimum) {
		super();
		this.myArray = myArray;
		this.average = average;
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public ArrStats(int[] valuesInt) {
	}

	/**
	 * @return the myArray
	 */
	public int[] getMyArray() {
		return myArray;
	}

	/**
	 * @param myArray the myArray to set
	 */
	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}

	/**
	 * @return the average
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(int average) {
		this.average = average;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	/****************
	 * <h1>Average The Int</h1>
	 * <h2>public static double Average(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the average of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (double)average / array.length
	 ****************/
	public static double getAverage(int[] array) {
		int average = 0;
		for (int i : array)
			average += i;
		return (double) average / array.length;
	}

	/****************
	 * <h1>Find Int Minimum</h1>
	 * <h2>public static double min(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the minimum of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (double)minimum
	 ****************/
	public static double getMin(int[] array) {
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] < minimum)
				minimum = array[i];
			if (array[i] > maximum)
				maximum = array[i];
		}
		return (double) minimum;
	}

	/****************
	 * <h1>Find Int Maximum</h1>
	 * <h2>public static double max(int [] array)</h2>
	 * <p>
	 * <strong>Purpose: </strong>
	 * </p>
	 * Takes in the array and finds the maximum of the 10 integers provided by the
	 * user.
	 * 
	 * @param array - Comes from user input
	 * @return (double)maximum
	 ****************/
	public static double getMax(int[] array) {
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] < minimum)
				minimum = array[i];
			if (array[i] > maximum)
				maximum = array[i];
		}
		return (double) maximum;
	}

	/*
	 * public ArrStats(int[] valuesInt) { int[] myArray = new int[10]; }
	 * 
	 * public myArray(int[] myArray) { int[] theArray = {1,2,3,4,5,6,7,8,9,10}; }
	 * 
	 * 1 2 3 4 5 6 7 8 9 10
	 */

}
