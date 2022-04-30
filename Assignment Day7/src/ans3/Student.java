package ans3;

public abstract class Student {
	String name;
	String address;
	
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	abstract int getPercentage( ) ;
	
	
	
	static int getTotalNoStudents( ) {
		return 0;
	}


}
