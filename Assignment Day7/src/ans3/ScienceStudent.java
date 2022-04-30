package ans3;

public class ScienceStudent extends Student{
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	static int noOfStudents;
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		
	}
	@Override
	int getPercentage(){
		return Math.round((phisicsMarks+chemistryMarks+mathsMarks)/3);
	}

	
	

}
