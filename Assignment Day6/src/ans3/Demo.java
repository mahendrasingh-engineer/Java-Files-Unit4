package ans3;

import java.util.Scanner;

import ans1.Main;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank.toLowerCase().equals("icici")) {
			return new ICICIBank("nilam pur kolawarui","ICICINPK326669",10);
		}
		
		if(bank.toLowerCase().equals("axis")) {
			return new AxisBank("nilam pur kolawarui","AXISNPK326669",10);
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		
		String s="";
		
		System.out.println("Enter the name of bank ");
		s=scanner1.nextLine();
		Bank b= getBank(s);
		if(b instanceof ICICIBank) {
			((ICICIBank)b).displayDetails();
		}else if(b instanceof AxisBank) {
			((AxisBank)b).displayDetails();
			((AxisBank)b).getCreditCard();
		}
		scanner1.close();
	}
}

