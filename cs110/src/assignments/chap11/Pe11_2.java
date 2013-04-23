package assignments.chap11;

public class Pe11_2 {

	/**
	 * @param args
	 *            test program for Person, Student, Employee, Faculty, and Staff
	 *            classes
	 */
	public static void main(String[] args) {
		Person bob = new Person("Bob");
		Student mary = new Student("Mary");
		Employee karl = new Employee("Karl");
		Faculty amy = new Faculty("Amy");
		Staff fred = new Staff("Fred");
		
		System.out.println(bob.toString());
		System.out.println(mary.toString());
		System.out.println(karl.toString());
		System.out.println(amy.toString());
		System.out.println(fred.toString());
	}

}
