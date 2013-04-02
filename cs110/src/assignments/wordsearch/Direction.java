 package assignments.wordsearch;
/**
 * Encapsulate a direction in terms of 'steps' in horizontal or vertical
 * direction. Each direction has a horizontal and vertical step which describes how
 * to increment an index stepping through a word in each dimension. A step is either 0, 1 or -1.
 * For example, the Easterly direction steps +1 horizontally and 0 vertically.
 * @author rgordon
 *
 */
public class Direction {
	public static final Direction EASTERLY = new Direction("Easterly", 0,1);
	public static final Direction WESTERLY = new Direction("Westerly", 0,-1);
	public static final Direction SOUTHERLY = new Direction("Southerly", 1,0);
	public static final Direction NORTHERLY = new Direction("Northerly", -1,0);
	public static final Direction NWtoSE = new Direction("NWtoSE", 1,1);
	public static final Direction SEtoNW = new Direction("SEtoNW", -1,-1);
	public static final Direction NEtoSW = new Direction("NEtoSW", 1,-1);
	public static final Direction SWtoNE = new Direction("SWtoNE", -1,1);
	private int horz;
	private int vert;
	private String name;
	
	public Direction(String name,int vert, int horz) {
		this.horz = horz;
		this.vert = vert;
		this.name = name;
	}
	
	public int getHorizontalStep() { return horz; }
	public int getVerticalStep() { return vert; }	
	public String toString() { return name; }
	public boolean equals(Direction d) {
		return (horz == d.getHorizontalStep()) && (vert == d.getVerticalStep());
	}
}
