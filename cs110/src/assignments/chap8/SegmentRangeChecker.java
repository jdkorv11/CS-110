package assignments.chap8;

public class SegmentRangeChecker {

	public boolean onSeg(EquationBuilder seg, double[] intersection) {
		boolean onSeg = false;
		double[] end1 = seg.getEndPoint1();
		double[] end2 = seg.getEndPoint2();
		boolean inXRange = false;
		boolean inYRange = false;
		
		if(end1[0] < intersection[0] && intersection[0] < end2[0])
			inXRange = true;
		else if(end2[0] < intersection[0] && intersection[0] < end1[0])
			inXRange = true;
		else if(end1[0] == intersection[0] || end2[0] == intersection[0]) //due to using double data types it is possible 
			inXRange = true;											// this will not catch if the end-points just touch
		
		if(end1[1] < intersection[1] && intersection[1] < end2[1])
			inYRange = true;
		else if(end2[1] < intersection[1] && intersection[1] < end1[1])
			inYRange = true;
		else if(end1[1] == intersection[1] || end2[1] == intersection[1])
			inYRange = true;
		
		if(inXRange && inYRange)
			onSeg = true;
		return onSeg;
	}
}
