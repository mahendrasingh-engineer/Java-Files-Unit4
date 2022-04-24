package ans2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int studentId=0; 
		String name=""; 
		int departmentId=0; 
		String gender="";
		String phone="";
		String hostelName="";
		int roomNumber=0;
		
		String yesNo="";
		
		Scanner scanner1=new Scanner(System.in);
		
		Hosteller student1;
		
		
		
		System.out.println("Enter the Details:");
		while(studentId<=0) {
			try {
				System.out.println("Enter Student Id:");
				studentId=scanner1.nextInt();
				scanner1.nextLine();
				if(studentId<=0) {
					System.out.println("please enter a valid Id");
				}
				
			} catch (Exception e) {
				scanner1.nextLine();
				System.out.println("please enter a valid Id");
			}
			
		}
		
		

		
		while(name=="") {
			try {
				System.out.println("Enter name:");
				name=scanner1.nextLine();
				if(name=="") {
					System.out.println("please enter a name");
				}
				
			} catch (Exception e) {
				System.out.println("please enter a name ");
			} 
		}
		
		while(departmentId<=0) {
			try {
				System.out.println("Enter department Id:");
				departmentId=scanner1.nextInt();
				scanner1.nextLine();
				if(departmentId<=0) { 
					System.out.println("please enter a valid Id");
				}
				
			} catch (Exception e) {
				scanner1.nextLine();
				System.out.println("please enter a valid Id");
			}
			
		}
		
		
		while(gender=="") {
			try {
				System.out.println("Enter gender:");
				gender=scanner1.nextLine();
				if(gender=="") {
					System.out.println("please enter a valid gender");
				}
				
			} catch (Exception e) {
				System.out.println("please enter a valid gender");
			}
			
		}
		
		
		while(phone=="") {
			try {
				System.out.println("Enter phone:");
				phone=scanner1.nextLine();
				if(phone=="") {
					System.out.println("please enter a valid phone");
				}
				
			} catch (Exception e) {
				System.out.println("please enter a valid phone");
			}
			
		}
		
		
		while(hostelName=="") {
			try {
				System.out.println("Enter Hostel Name:");
				hostelName=scanner1.nextLine();
				if(hostelName=="") {
					System.out.println("please enter a valid Hostel Name");
				}
				
			} catch (Exception e) {
				System.out.println("please enter a valid Hostel Name");
			}
			
		}
		
		while(roomNumber<=0) {
			try {
				System.out.println("Enter Room Number:");
				roomNumber=scanner1.nextInt();
				scanner1.nextLine();
				if(roomNumber<=0) {
					
					System.out.println("please enter a valid Room Number");
				}
				
			} catch (Exception e) {
				scanner1.nextLine();
				System.out.println("please enter a valid Room Number");
			}
			
		}
		
		System.out.println("Enter Modify Room Number(Y/N)");
		yesNo= scanner1.next();
		scanner1.nextLine();
		//System.out.print(yesNo);
		if(yesNo.toLowerCase().equals("y")) {
			try {
				System.out.println("Enter Room Number:");
				roomNumber=scanner1.nextInt();
				scanner1.nextLine();
				if(roomNumber<=0) {
					
					System.out.println("please enter a valid Room Number");
				}
				
			} catch (Exception e) {
				scanner1.nextLine();
				System.out.println("please enter a valid Room Number");
				roomNumber=0;
			}
			while(roomNumber<=0) {
				try {
					System.out.println("Enter Room new Number:");
					roomNumber=scanner1.nextInt();
					scanner1.nextLine();
					if(roomNumber<=0) {
						
						System.out.println("please enter a valid Room Number");
					}
					
				} catch (Exception e) {
					scanner1.nextLine();
					System.out.println("please enter a valid Room Number");
				}
				
			}
		}
		
		System.out.println("Enter Modify Phone Number(Y/N)");
		yesNo= scanner1.next();
		scanner1.nextLine();
		if(yesNo.toLowerCase().equals("y")) {
			try {
				System.out.println("Enter new phone:");
				phone=scanner1.nextLine();
				if(phone=="") {
					System.out.println("please enter a valid phone");
				}
				
			} catch (Exception e) {
				System.out.println("please enter a valid phone");
			}
			while(phone=="") {
				try {
					System.out.println("Enter phone:");
					phone=scanner1.nextLine();
					if(phone=="") {
						System.out.println("please enter a valid phone");
					}
					
				} catch (Exception e) {
					System.out.println("please enter a valid phone");
				}
				
			}
		}
		
		
		
		
		System.out.print("The Student Details  :");
		student1=new Hosteller(studentId, name, departmentId, gender, phone, hostelName, roomNumber);
		
		System.out.println(student1.getName()+" "+student1.getPhone()+" "+student1.getGender()+" "+student1.getDepartmentId()+" "+student1.getHostelName()+" "+student1.getRoomNumber()+" "+student1.getStudentId());
		scanner1.close();
		
		
//		Student Id:
//			Student Name:  +" "
//			 John
//			Department Id:
//			 101
//			Gender:
//			Male
//			Phone Number:
//			 9876543210
//			Hostel Name
//			YMCA
//			Room Number
//			10
//			Modify Room Number(Y/N)
//			Y
//			New Room Number
//			11
//			Modify Phone Number(Y/N)
//			Y
//			New Phone Number 9876543121


	}
	public static Hosteller getHostellerDetails() {
		return null;
	}
}
