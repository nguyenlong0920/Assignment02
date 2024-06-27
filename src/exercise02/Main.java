package exercise02;

public class Main {
	public static void main(String[] args) {
		// Creating a student object using the no-argument constructor
		Student student1 = new Student();
		student1.setID(01);
		student1.setName("Johnson Nguyen");
		student1.setAge(24);

		// Creating a student object using the parameterized constructor
		Student student2 = new Student(132, "Long", 24);
		
		// Printing student details
		System.out.println(student1.toString());
		System.out.println(student2.toString());	
	}
}