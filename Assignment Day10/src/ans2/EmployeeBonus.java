package ans2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ans1.InvalidDateFormat;

public class EmployeeBonus {
	public double method(String dateString) throws InvalidAgeException,InvalidDateFormat{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int years=0;
		try {
			LocalDate date=LocalDate.parse(dateString,dtf);
			years=LocalDate.now().getYear()-date.getYear();
		} catch (Exception e) {
			System.out.println("please enter age in correct formate");
			throw e;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		if(years<0) {
			throw new InvalidAgeException();
		}
		
		
		if(years<1) {
			return 5000;
		}else if(years<2) {
			return 8000;
		}else {
			return 10000;
		}
		
	}
			
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your date of birth");
		String dob;
		EmployeeBonus epb=new EmployeeBonus();
		dob=scanner.nextLine();
		try {
			System.out.println("your bonus is "+ epb.method(dob));
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("enter valid date");
		}
		
		System.out.println("exited......normaly");
		scanner.close();
	}
			
			
}
