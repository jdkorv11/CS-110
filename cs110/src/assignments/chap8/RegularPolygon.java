package assignments.chap8;

public class RegularPolygon {

	private final int DEFAULT_NUMBER_OF_SIDES = 3;
	private int n = DEFAULT_NUMBER_OF_SIDES;

	private final double DEFAULT_SIDE_LENGTH = 1;
	private double side = DEFAULT_SIDE_LENGTH;

	private final double DEFAULT_X_COORDINATE = 0;
	private double x = DEFAULT_X_COORDINATE;

	private final double DEFAULT_Y_COORDINATE = 0;
	private double y = DEFAULT_Y_COORDINATE;

	RegularPolygon() { // construct polygon with default values

	}

	RegularPolygon(int numberOfSides, double sideLength) {
		n = numberOfSides;
		side = sideLength;
	}

	RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
		n = numberOfSides;
		side = sideLength;
		this.x = x;
		this.y = y;
	}

	public void setNumOfSides(int num) {
		n = num;
	}

	public void setSideLength(double length) {
		side = length;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setCoordinates(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public int getNumOfSides() {
		return n;
	}

	public double getSideLength() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double[] getCoordinates() {
		double[] coordinates = { x, y };
		return coordinates;
	}

	public double getPerimeter() {
		double perimeter = n * side;
		return perimeter;
	}

	public double getArea() {
		double area = area(n, side);
		return area;
	}

	private double area(int n, double side) {
		double numerator = n * (side * side);
		double denominator = 4 * Math.tan(Math.PI / n);
		double area = numerator / denominator;
		return area;
	}

}
