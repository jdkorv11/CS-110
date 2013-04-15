package assignments.chap10;

public class Pe10_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Course compSci = new Course("Computer Science");

		compSci.addStudent("Prof. Gordon");
		compSci.addStudent("Joshua");
		compSci.addStudent("PJ");
		compSci.dropStudent("Prof. Gordon");
		String[] students = compSci.getStudents();
		for (String s : students)
			System.out.println(s);
	}

}
