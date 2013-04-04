package assignments.chap8;

class EquationBuilder {
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	private double a;
	private double b;
	private double c;
	private double[] end1 = new double[2];
	private double[] end2 = new double[2];

	public EquationBuilder(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

		// make a, b, and c fit the form ax + by = c for the given end points
		a = 1;
		b = -1 / getSlope();
		c = ((-1 * y1) / getSlope()) + x1;
		end1[0] = x1;
		end1[1] = y1;
		end2[0] = x2;
		end2[1] = y2;
	}

	public double getSlope() {
		return ((y2 - y1) / (x2 - x1));
	}

	public double getXCoeficient() {
		return a;
	}

	public double getYCoeficient() {
		return b;
	}

	public double getYIntercept() {
		return c;
	}

	public double[] getEndPoint1() {
		return end1;
	}

	public double[] getEndPoint2() {
		return end2;
	}

}
