public class RectangularBox {

	private int width;
	private int height;
	private int depth;

	/**
	 * Establishes the initial value
	 */
	public RectangularBox() {
		width = 1;
		height = 1;
		depth = 1;
	}

	/**
	 * @param int width, int height, int depth
	 */
	public RectangularBox(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	/**
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param int width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param int height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param int depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @param int w, int d, int h
	 * @return surfaceArea
	 */
	public int getSurfaceArea(int w, int d, int h) {
		int surfaceArea = (2 * w * d) + (2 * d * h) + (2 * h * w);
		return surfaceArea;
	}

	/**
	 * @param int w, int d, int h
	 * @return volume
	 */
	public int getVolume(int w, int d, int h) {
		int volume = (w * d * h);
		return volume;
	}
}
