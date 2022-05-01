package ans2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username=" ";
		String password=" ";
		String mobile_number=" ";
		String email="";
		
		
		while(!Pattern.matches("[a-zA-Z]{3,8}", username)) {
			System.out.println("Enter the username");
			username=scanner.nextLine();
			if(!Pattern.matches("[a-zA-Z]{3,8}", username)){
				System.out.println("invalid username, username should contain only alphabets and length should be min 3 and max 8");
			}
		}
		
		
		
		
		while(!Pattern.matches("[a-zA-Z0-9]*${3,8}", password)) {
			System.out.println("Enter the password");
			password=scanner.nextLine();
			if(!Pattern.matches("[a-zA-Z0-9]*${3,8}", password)){
				System.out.println("invalid password, password should be alphanumeric and length should be min 3 and max 8");
			}
		}
		
		
		while(!Pattern.matches("[6789][0-9]{9}", mobile_number)) {
			System.out.println("Enter the mobile number");
			mobile_number=scanner.nextLine();
			if(!Pattern.matches("[6789][0-9]{9}", mobile_number)){
				System.out.println("invalid mobile number");
			}
		}
		
		
		
		while(!Pattern.matches("[a-zA-Z0-9]+[@]{1}+[.]{1}+[c][o][m]{1}", email)) {
			System.out.println("Enter the email address");
			email=scanner.nextLine();
			if(!Pattern.matches("[a-zA-Z0-9]+[@]{1}+[.]{1}+[c][o][m]{1}", email)){
				System.out.println("invalid email address");
			}
		}
		
		
		
		
		
		
		
		
		Customer customer=new Customer(username, password, mobile_number, email);
		System.out.println("username  "+customer.getUsername()+"\\r\\n"
				+ "		mobile   "+customer.getMobileNumber()+"\\r\\n"
				+ "		email            "+      customer.getEmail()                                   );
		
		
		
		
		
//		customer.setUsername(scanner.nextLine());
//		System.out.println("Enter the password");
//		customer.setPassword(scanner.nextLine());
//		System.out.println("Enter a mobile number");
//		customer.setMobileNumber(scanner.nextLine());
//		System.out.println("Enter a e-mail address");
//		customer.setEmail(scanner.nextLine());
		
		scanner.close();
	}
}
