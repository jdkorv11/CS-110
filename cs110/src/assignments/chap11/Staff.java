package assignments.chap11;

public class Staff extends Employee {
	private String title;

	public Staff() {

	}

	public Staff(String name) {
		setName(name);
	}

	public String toString() {
		String s = "Staff: " + getName();
		return s;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
