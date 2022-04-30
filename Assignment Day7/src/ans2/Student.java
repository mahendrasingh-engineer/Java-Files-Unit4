package ans2;

import java.util.Scanner;

public class Student {
	private int roll; 
	private String name;
	private int marks;
	private char grade;
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = calculateGrade();
	}
	
	
	
	

	public Student() {
		super();
	}





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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return "name : "+name+", Roll Number :"+roll+", marks : "+marks+", grade :"+grade+""+""+""+""+"";
		
	}
	
	
	
	public static void displayDetails(Scanner sc) {
		Student[] s=new Student[2];
		for (Student student : s) {
			student=new Student();
			System.out.println("please enter the name of the student");
			student.name=sc.nextLine();
			System.out.println("plese enter the roll number of student");
			student.roll=sc.nextInt();
			sc.nextLine();
			
			System.out.println("please enter the marks of the student");
			student.marks=sc.nextInt();
			sc.nextLine();
			student.grade=student.calculateGrade();
			System.out.println(student);
		}
		
		
		
		
		
		
	}
	 private char calculateGrade() {
		 char grade='-';
		 if (marks >= 500 ) grade = 'A';
		 if (marks < 500 && marks>= 400) grade ='B';
		 if (marks <400 ) grade = 'C';

		 return grade; 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
