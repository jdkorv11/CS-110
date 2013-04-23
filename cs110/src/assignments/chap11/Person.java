package assignments.chap11;

public class Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		String s = "Person: " + name;
		return s;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

}
