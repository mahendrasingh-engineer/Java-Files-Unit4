package student;

public class Demo {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student(122, "moni", 24, 500);
		
//printing s1 details
		System.out.println("name         :"+s1.getName());
		System.out.println("Roll-Number  :"+s1.getRoll());
		System.out.println("Age          :"+s1.getAget());
		System.out.println("marks        :"+s1.getMarks());
		System.out.println("===========================================");
		
//printing s2 details
		System.out.println("name         :"+s2.getName());
		System.out.println("Roll-Number  :"+s2.getRoll());
		System.out.println("Age          :"+s2.getAget());
		System.out.println("marks        :"+s2.getMarks());
		System.out.println("===========================================");
	}

}
