package assignments.chap8;

public class Pe8_9 {

	/**
	 * @param args
	 *            test program for the class RegularPolygon
	 */
	public static void main(String[] args) {

		RegularPolygon noArg = new RegularPolygon();
		RegularPolygon hexa = new RegularPolygon(6, 4);
		RegularPolygon deca = new RegularPolygon(10, 4, 5.6, 7.8);

		double noArgPerimeter = noArg.getPerimeter();
		double noArgArea = noArg.getArea();

		double hexaPerimeter = hexa.getPerimeter();
		double hexaArea = hexa.getArea();

		double decaPerimeter = deca.getPerimeter();
		double decaArea = deca.getArea();

		System.out.println("The default polygon (triangle) has a perimeter of "
				+ noArgPerimeter + " and an area of " + noArgArea);

		System.out.println("The hexagon with a side lenght of 4 has a perimeter of " + hexaPerimeter
				+ " and an area of " + hexaArea);

		System.out.println("The decagon with a side length of 4 has a perimeter of " + decaPerimeter
				+ " and an area of " + decaArea);

	}

}
