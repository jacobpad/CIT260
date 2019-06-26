/**
 * A Class for the pirates! Arr!!!
 */
public class ArrStats {
	private int[] valuesInt;
	private int average;
	private int maximum;
	private int minimum;

	/**
	 * @param valuesInt
	 * @param average
	 * @param maximum
	 * @param minimum
	 */
	public ArrStats(int[] valuesInt, int average, int maximum, int minimum) {
		super();
		this.valuesInt = valuesInt;
		this.average = average;
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @param valuesInt
	 */
	public ArrStats(int[] valuesInt) {
		this.valuesInt = valuesInt;
	}

	/**
	 * @return the valuesInt
	 */
	public int[] getMyArray() {
		return valuesInt;
	}

	/**
	 * @param valuesInt the valuesInt to set
	 */
	public void setMyArray(int[] valuesInt) {
		this.valuesInt = valuesInt;
	}

	/**
	 * @return the average
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * @param average the average comes from 'this'
	 */
	public void setAverage() {
		int average = 0;
		for (int i : this.valuesInt)
			average += i;
		this.average = average / this.valuesInt.length;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum the maximum comes from 'this'
	 */
	public void setMaximum() {
		int minimum = this.valuesInt[0];
		int maximum = this.valuesInt[0];
		for (int i = 0; i <= this.valuesInt.length - 1; i++) {
			if (this.valuesInt[i] < minimum)
				minimum = this.valuesInt[i];
			if (this.valuesInt[i] > maximum)
				maximum = this.valuesInt[i];
		}
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum the minimum comes from 'this'
	 */
	public void setMinimum() {

		int minimum = this.valuesInt[0];
		int maximum = this.valuesInt[0];
		for (int i = 0; i <= this.valuesInt.length - 1; i++) {
			if (this.valuesInt[i] < minimum)
				minimum = this.valuesInt[i];
			if (this.valuesInt[i] > maximum)
				maximum = this.valuesInt[i];
		}
		this.minimum = minimum;
	}
}
