/**
 * 
 */

/**
 * @author jacob
 *
 */
public class GeometricObject {

	/**
	 * 
	 */
	public GeometricObject() {
	}

	public double getArea(double width, double length) {
		double w = width;
		double l = length;
		return w * l;
	}

	public double GetPerimeter(double width, double length) {
		double w = width;
		double l = length;
		return (2 * w) + (2 * l);
	}

	public boolean isFilled() {
		return false;

	}

}
