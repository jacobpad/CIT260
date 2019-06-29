/**
 * public class Rectangle extends GeometricObject 
 */

/**
 * @author jacob
 *
 */
public class Rectangle extends GeometricObject {
	private double width;
	private double length;

	/**
	 * Constructor public Rectangle()
	 */
	public Rectangle() {
		super();
		this.width = 0;
		this.length = 0;
	}

	/**
	 * 
	 * @param width
	 * @param length
	 * @param isFilled
	 * @param color
	 */
	public Rectangle(double width, double length, Boolean isFilled, String color) {
		super(isFilled, color);
		this.width = width;
		this.length = length;
	}

	/**
	 * double getWidth()
	 * 
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * getArea Method
	 * 
	 * @return
	 */
	@Override
	public double getArea() {
		return width * length;
	}

	/**
	 * getPerimeter Method
	 * 
	 * @return
	 */
	@Override
	public double getPerimeter() {
		return (2 * width) + (2 * length);
	}

	/**
	 * toString Method
	 */
	@Override
	public String toString() {
		String isFilledString;
		if (getIsFilled()) {
			isFilledString = "filled";
		} else {
			isFilledString = "not filled";
		}
		String detailString = "\nYour " + getColor() + " rectangle is " + length + " by " + width + " and is "
				+ isFilledString + ". It's got an area of " + getArea() + " and a perimeter of " + getPerimeter()
				+ ". Below is another way to look at it.\n" + "\nLength: " + length + "\nWidth: " + width + "\nColor: "
				+ getColor() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nIt's " + isFilledString;
		return detailString;

	}
}
