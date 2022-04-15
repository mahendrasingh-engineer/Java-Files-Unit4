package ans3;


public class Demo{
	public static void main(String[] args) {
		Student s1= Student.getStudent(false);
		Student s2=Student.getStudent(true);
		System.out.println("student1 details");
		System.out.println("name          : "+s1.getName());
		System.out.println("roll          : "+s1.getRoll());
		System.out.println("address       : "+s1.getAddress());
		System.out.println("college name  : "+s1.getCollageName());
		System.out.println();
		System.out.println();
		System.out.println("=================================================");
		System.out.println("student2 details");
		System.out.println("name          : "+s2.getName());
		System.out.println("roll          : "+s2.getRoll());
		System.out.println("address       : "+s2.getAddress());
		System.out.println("college name  : "+s2.getCollageName());
		
	}
}



class Student {
	private int roll;
	private String name;
	String address;
	String collageName;
//constructors//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}



	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}



//////////////////////////////////////////////getters and setter methods//////////////////////////////////////////
	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCollageName() {
		return collageName;
	}



	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
////////// static methods////////////////////////////////////////////////////////////////////////////////
	public static Student getStudent(boolean isFromNIT) {
		Student s1=null;
		if(isFromNIT) {
			s1=new Student(241, "santilal", "majanupur");
		}else {
			s1 =new Student(241, "santilal", "majanupur","jacki college of tech");
		}
		return s1;
	}

//////////////////////the main method////////////////////////////////////////////////////////////////////
	
}
