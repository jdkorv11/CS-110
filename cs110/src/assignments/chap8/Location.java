package assignments.chap8;

public class Location {
	public static int row;
	public static int column;
	public static double maxValue;

	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		maxValue = a[0][0]; // initialize to a value from the array
		for (int i = 0; i < a.length; i++) {
			for (int col = 0; col < a[i].length; col++) {
				if (a[i][col] > maxValue) {
					row = i;
					column = col;
					maxValue = a[i][col];
				}
			}
		}
		return l;
	}
}
