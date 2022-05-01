package ans3;

import java.util.Scanner;

public class Demo {
	
	public void showDetails(Month m){
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("ENTER NAME OF A MONTH");
		Scanner scanner = new Scanner(System.in);
		
		boolean repeat=true;
		String name="";
		Month month;
		
		while(repeat) {
			try {
				name=scanner.nextLine();
				month=Month.valueOf(name.toUpperCase());
				
				month.printDetails();
				repeat=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("please enter a valid name");
			}
		}
		
		scanner.close();
	}

}
