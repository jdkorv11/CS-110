package assignments.chap11;

public class Faculty extends Employee {
	private String rank;
	private String officeHours;

	public Faculty() {

	}

	public Faculty(String name) {
		setName(name);
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String toString() {
		String s = "Faculty: " + getName();
		return s;
	}

	public String getRank() {
		return rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

}
