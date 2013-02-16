package practice.loops;

public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[]  array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		char temp;
		int k = array.length;
		//can use complex conditions in for loop example below
		for (int front = 0, back = array.length - 1; front < back; front ++, back -- ) { 
			temp = array[front];
			array[front] = array[back];
			array[back] = temp;
		}
		System.out.println(array);
	}

}
