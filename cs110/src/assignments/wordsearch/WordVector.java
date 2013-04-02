package assignments.wordsearch;

public class WordVector {
	private int row;
	private int col;
	private int length;
	private Direction direction;
	
	public WordVector(int row, int col, int length, Direction direction) {
		this.row = row;
		this.col = col;
		this.length = length;
		this.direction = direction;
	}

	public String toString() { //WordVector [row = n, column = m, direction, length]
		StringBuffer sb = new StringBuffer();
		sb.append("[row = ");
		sb.append(String.valueOf(row));
		sb.append(", column = ");
		sb.append(String.valueOf(col));
		sb.append(", Direction = ");
		sb.append(direction);
		sb.append(", Length = ");
		sb.append(length);
		sb.append("]");
		
		return sb.toString();
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getLength() {
		return length;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	

}
