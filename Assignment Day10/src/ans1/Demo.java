package ans1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws InvalidDateFormat {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your date of birth");
		String dob=scanner.nextLine();
		
		LocalDate date;
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			date=LocalDate.parse(dob, dtf);
			int years=(LocalDate.now().getYear()- date.getYear());
			if(years>=0)
				System.out.println("your age is "+years);
			else
				System.out.println("date can't be in future");
		} catch (Exception e) {
			throw new InvalidDateFormat();
		}
		
		scanner.close();
	}
}
