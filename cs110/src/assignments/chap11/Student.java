package assignments.chap11;

public class Student extends Person {

	public enum ClassStatus {
		Freshman, Sophomore, Junior, Senior;
	}

	private ClassStatus classStatus;

	public Student() {

	}

	public Student(String name) {
		setName(name);
	}

	public void setClassStatus(ClassStatus status) {
		classStatus = status;
	}

	public String toString() {
		String s = "Student: " + getName();
		return s;
	}

	public ClassStatus getClassStatus() {
		return classStatus;
	}

}
