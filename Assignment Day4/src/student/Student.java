package student;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
////////constructors
	Student(){
		
	}
	
	
	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		if(18<=age&&age<60)
		this.age = age;
		if(0<=marks&&marks<=500)
		this.marks = marks;
	}

////setter methods
	public void setRoll(int i) {
		roll=i;
	}
	public void setName(String i) {
		name=i;
	}
	public void setAget(int i) {
		if(18<=i&&i<60)
		age=i;
	}
	public void setMarks(int i) {
		if(0<=i&&i<=500)
		marks=i;
	}
	
////getter methods
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getAget() {
		return age;
		
	}
	public int getMarks() {
		return marks;
	}

}
