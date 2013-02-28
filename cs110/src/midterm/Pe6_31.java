package midterm;

public class Pe6_31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,2,3,6};
		int[] b = {3,4,5};
		
		int[] c = merge(a,b);
		for(int i: c) {
			System.out.print(i + " ");
		}
	}
	public static int[] merge(int[] list1, int[] list2) {
		int[] merge = {};
		int[] tmp;
		int i = 0;
		for (int n = 0; n < list1.length; n++) {
			tmp = merge;
			merge = new int[tmp.length + 1];
			i = 0;
			for (; i < tmp.length; i++) {
				merge[i] = tmp [i];
			}
			merge[i] = list1[n];			
		}
		for (int n = 0; n < list2.length; n++) {
			tmp = merge;
			merge = new int[tmp.length + 1];
			int j = 0;
			for (; j < tmp.length; j++) {
				merge[j] = tmp [j];
			}
			merge[j] = list2[n];
			i++;
			
		}
		return merge;
	}

}
