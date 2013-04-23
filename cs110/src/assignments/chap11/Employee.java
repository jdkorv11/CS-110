package assignments.chap11;

import java.util.Date;

public class Employee extends Person {
	private int office;
	private double salary;
	private Date dateHired;

	public Employee() {

	}

	public Employee(String name) {
		setName(name);
	}

	public String toString() {
		String s = "Employee: " + getName();
		return s;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDateHired(Date date) {
		dateHired = date;
	}

	public int getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

}
