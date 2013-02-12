package assignments.chap4;

public class Pe4_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char firstChar = '!';
		char lastChar = '~';
		int asciiCounter = (int) firstChar;
		int lastAsciiValue = (int) lastChar; 
		int lineCount = 0;
		
		for(; asciiCounter <= lastAsciiValue; asciiCounter ++) {
			System.out.printf("%c ", asciiCounter);
			lineCount ++;
			if (lineCount == 10) {
				System.out.println();
				lineCount = 0;
			}
		}

	}

}
