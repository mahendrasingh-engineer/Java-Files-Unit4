package student;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("name :"+name);
		System.out.println("roll-number: "+roll);
		System.out.println("marks: "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="aman";
		s1.roll=122;
		s1.marks=56;
		Student s2=new Student();
		s2.name="harsh";
		s2.roll=444;
		s2.marks=67;
		s1.displayStudentDetails();
		System.out.println("===========================");
		s2.displayStudentDetails();
	}

}
