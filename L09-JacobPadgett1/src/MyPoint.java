/**
 * Class MyPoint
 */

/**
 * @author jacob
 *
 */
public class MyPoint {
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	/**
	 * No arg constructor
	 * 
	 * @param secondCoordinateY
	 * @param secondCoordinateX
	 */
	public MyPoint(double secondCoordinateX, double secondCoordinateY) {
		x1 = 0;
		y1 = 0;
		x2 = 10;
		y2 = 30.5;
	}

	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public MyPoint(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public MyPoint(double x1) {
	}

	/**
	 * @return the x1
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(double x1) {
		this.x1 = x1;
	}

	/**
	 * @return the y1
	 */
	public double getY1() {
		return y1;
	}

	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(double y1) {
		this.y1 = y1;
	}

	/**
	 * @return the x2
	 */
	public double getX2() {
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(double x2) {
		this.x2 = x2;
	}

	/**
	 * @return the y2
	 */
	public double getY2() {
		return y2;
	}

	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(double y2) {
		this.y2 = y2;
	}

	/**
	 * Not sure about this
	 */
	public double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
