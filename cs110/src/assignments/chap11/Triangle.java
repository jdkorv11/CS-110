package assignments.chap11;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** Create a default triangle0 */
	public Triangle() {
		final double DEFAULT_SIDE_LENGTH = 1;
		side1 = DEFAULT_SIDE_LENGTH;
		side2 = DEFAULT_SIDE_LENGTH;
		side3 = DEFAULT_SIDE_LENGTH;
	}

	/** Create a triangle with specific side lengths */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Get side1 */
	public double getSide1() {
		return side1;
	}

	/** Get side2 */
	public double getSide2() {
		return side2;
	}

	/** Get side3 */
	public double getSide3() {
		return side3;
	}

	/** Get area */
	public double getArea() {
		double area = Math.sqrt((getPerimeter() / 2) * side1 * side2 * side3);
		return area;
	}

	/** Get perimeter */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Return a string that describes this object */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}