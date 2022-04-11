package course;

public class Course {
	int courseId;
	int courseFee;
	String courseName;
	void displayCourseDetails() {
		System.out.print("courseId :  ");
		System.out.println(courseId);
		System.out.print("courseFee :  ");
		System.out.println(courseFee);
		System.out.print("courseName :  ");
		System.out.println(courseName);
	}
	static void authenticate(String username,String password) {
		if(username=="Admin"&&password=="1234") {
			Course c1=new Course();
			c1.courseFee= 2300;
			c1.courseId=22;
			c1.courseName="software maker";
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.authenticate("Admin", "1234");
		
		
		
	}

}
