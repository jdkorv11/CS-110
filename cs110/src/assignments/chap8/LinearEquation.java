package assignments.chap8;

public class LinearEquation {
	// variables for equations in the format
	// ax + by = e
	// cx + dy = f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	private double[] intersection = new double[2];

	public LinearEquation(double a, double b, double e, double c, double d,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

		// find the intersection
		if (isSolvable(a, b, c, d)) {
			intersection[0] = (e * d - b * f) / (a * d - b * c);
			intersection[1] = (a * f - e * c) / (a * d - b * c);
		} else {
			System.out.println("There is no intersection.");
			System.exit(-1);
		}

	}

	private boolean isSolvable(double a, double b, double c, double d) {
		if ((a * d) - (b * c) == 0)
			return false;
		else
			return true;
	}

	public double[] getIntersection() {
		return intersection;
	}

	public double getX() {
		return intersection[0];
	}

	public double getY() {
		return intersection[1];
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
}
