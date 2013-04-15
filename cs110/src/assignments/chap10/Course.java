package assignments.chap10;

public class Course {
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		String[] temp = new String[students.length];
		for (int i = 0; i < students.length; i++)
			temp[i] = students[i];
		students = new String[numberOfStudents + 1];
		for (int i = 0; i < temp.length; i++)
			students[i] = temp[i];
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		int removalIndex = -1;
		for (int i = 0; i < students.length; i++) {
			if (student == students[i]) {
				removalIndex = i;
				break;
			}
		}
		numberOfStudents--;
		String[] temp = new String[numberOfStudents];
		int j = 0;
		for (int i = 0; i < removalIndex; i++) {
			temp[i] = students[i];
			j++;
		}
		for (; j < temp.length; j++)
			temp[j] = students[j + 1];
		students = new String[numberOfStudents];
		for (int i = 0; i < students.length; i++)
			students[i] = temp[i];
		System.gc();
	}

	public void clear() {
		students = new String[0];
		System.gc();
	}

}
