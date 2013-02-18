package assignments.chap4;

public class Pe4_44 {

	/**
	 * @param args
	 */
	public static double[] generatePoint() {
		//randomly generates a point in the range of (-1,-1) to (1,1)
		double[] point = new double[2];
		point[0] = (Math.random() * 2) - 1;
		point[1] = (Math.random() * 2) - 1;
		return point;

	}
	public static int inRegion1Check(double[] point, int hitCount) {
		//check if a given point is in the region to the left of the origin (region 1) 
		if (point[0] < 0) {
			hitCount ++;
		}
		return hitCount;

	}
	public static int inRegion3Check(double[] point, int hitCount) {
		// check if the point is the the triangle formed by the points (1,0), (0,1), and (0,0) (region 3)
		if (point[0] > 0 && point[1] > 0) {
			if (point[0] + point[1] < 1) {
				hitCount ++;
			}
		}
		// insert fix for the point being on the vertical axis above zero
		else if (point[1] > 0 && point[0] == 0) {
			hitCount ++;
		}
		return hitCount;
	}
	public static void main(String[] args) {
		double[] point = new double[2];
		int oddRegionHitCount = 0;
		
		for (int i = 0; i < 1000000; i ++) {
			point = generatePoint();
			oddRegionHitCount = inRegion1Check(point, oddRegionHitCount);
			oddRegionHitCount = inRegion3Check(point, oddRegionHitCount);
		}
		String[] explinationTable = {" ____ ____",
				                     "|    |\\ 2 |",
				                     "|    | \\  |",
				                     "|    |  \\ |",
				                     "|    | 3 \\|",
				                     "|  1 |----|",
				                     "|    |    |",
				                     "|    | 4  |",
				                     "|    |    |",
				                     "|____|____|", ""};
		for (int i = 0; i < explinationTable.length; i ++) {
			System.out.println(explinationTable[i]);
		}
		System.out.print(oddRegionHitCount + " out of 1,000,000 darts randomly thrown at the above target\n" + 
		"hit in odd numbered regions.");
		
	}

}
