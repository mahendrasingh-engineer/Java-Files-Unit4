package ans4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=-1;
		 Integer roll=-1;
		 String name="";
		 String address="";
		 Integer marks=-1;
		
		
		
		while(a<=0) {
			try {
				System.out.println("please enter a positive integer");
				a=sc.nextInt();
				sc.nextLine();
				if(a<=0) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("please enter a valid value");
				sc.nextLine();
			}
		}
		Student[] students= new Student[a];
		int j=1;
		for(int i=0;i<a ;i++) {
			System.out.println("please enter the details for student("+j+")");
			while(roll<=0) {
				try {
					System.out.println("please enter roll number");
					roll=sc.nextInt();
					sc.nextLine();
					if(a<=0) {
						throw new Exception();
					}
				}catch (Exception e) {
					System.out.println("please enter a valid value");
					sc.nextLine();
				}
			}
			while(name=="") {
				try {
					System.out.println("please enter name");
					name=sc.nextLine();
					if(name=="") {
						throw new Exception();
					}
				}catch (Exception e) {
					System.out.println("please enter a valid value");
				}
			}
			while(marks<0) {
				try {
					System.out.println("please enter marks");
					marks=sc.nextInt();
					sc.nextLine();
					if(marks<0) {
						throw new Exception();
					}
				}catch (Exception e) {
					System.out.println("please enter a valid value");
					sc.nextLine();
				}
			}
			while(address=="") {
				try {
					System.out.println("please enter address");
					address=sc.nextLine();
					if(address=="") {
						throw new Exception();
					}
				}catch (Exception e) {
					System.out.println("please enter a valid value");
				}
			}
			students[i]=new Student(roll, name, address, marks);
			
			
			roll=-1;
			name="";
			address="";
			marks=-1;
			j++;
		}
		
		
		
		j=1;
		for(Student i:students) {
			System.out.println("printing the details for student("+j+")");
			
			System.out.println("name          :  "+i.getName());
			System.out.println("roll number   :  "+i.getRoll());
			System.out.println("address       :  "+i.getAddress());
			System.out.println("marks         :  "+i.getMarks());
			
			
			
			
			System.out.println("======================================");
			System.out.println();
			System.out.println();
			j++;
		}
		
		
		
		sc.close();
	}
}
