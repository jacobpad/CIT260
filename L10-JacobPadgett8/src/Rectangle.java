/**
 * 
 */

/**
 * @author jacob
 *
 */
public class Rectangle extends GeometricObject {
	private double width;
	private double length;

	/**
	 * 
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
		return = String("\n\nYour " + getColor() + " rectangle is " + width + " x " + length + " and is " + isFilledString
				+ "\n\nWidth: " + width + "\nLength: " + length + "\nFilled: " + isFilledString + "\nColor: " + getColor()
				+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter());
	}
}
