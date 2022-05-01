package ans1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}else if(amount>200) {
			return new RoadSideHotel();
		}
		
		
		
		return null;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=scanner.nextInt();
		scanner.nextLine();
		Hotel yourHotel=new Demo().provideFood(amount);
		
		if(yourHotel!=null) {
			yourHotel.chickenBiryani();
			yourHotel.masalaDosa();
			if(yourHotel instanceof TajHotel) {
				((TajHotel)yourHotel).welcomeDrink();
			}
		}else {
			System.out.println("Please enter valid amount");
		}
		
		scanner.close();
	}

}
