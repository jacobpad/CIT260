/**
 * public abstract class GeometricObject is a super() for the week
 */

/**
 * @author jacob
 *
 */
public abstract class GeometricObject {

	private Boolean isFilled;
	private String color;

	/**
	 * Constructor
	 */
	public GeometricObject(Boolean isFilled, String color) {
		this.isFilled = isFilled;
		this.color = color;
	}

	/**
	 * Another constructor
	 */
	public GeometricObject() {
		this.isFilled = false;
		this.color = "";
	}

	/**
	 * double getPerimeter()
	 * 
	 * @return
	 */
	public abstract double getPerimeter();

	/**
	 * double getArea()
	 * 
	 * @return
	 */
	public abstract double getArea();

	/**
	 * @return the isFilled
	 */
	public Boolean getIsFilled() {
		return isFilled;
	}

	/**
	 * @param isFilled the isFilled to set
	 */
	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * String toString()
	 */
	public abstract String toString();

}
