package ans2;

import java.util.Scanner;
class Main {
public static void main(String args[]) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = 0;
		boolean repeat=true;
		
		while(repeat) {
			try {
				num1=sc.nextInt();
				sc.nextLine();
				repeat=false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid number");
			}
		}
		repeat=true;
		int num2=0;
		System.out.println("Enter num2");
		while(repeat) {
			try {
				num2=sc.nextInt();
				sc.nextLine();
				repeat=false;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("please enter a valid number");
			}
		}
		
		String message = null;
		int num3 = num1 / num2;
		
		if(num3 > 10){
			message = "Welcome to Exception Handling ";
		}
		try {
			System.out.println("Message is :"+message.toUpperCase());
		} catch (Exception e) {
//			e.printStackTrace();
		}
		
		System.out.println("end of main");
	}
}

