package ans4;

import java.util.Scanner;

public class Demo {
	
	
	
	
	
	
	
	public int calculateAverage(int[] age){
		int sum=0;
		for (int i : age) {
			sum+=i;
		}
		
		
		return Math.round(sum/age.length);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int l=-1;
		while(l<2) {
			System.out.println("Enter total no.of employees: ");
			try {
				l=Integer.parseInt(scanner.nextLine());
				if(l<2) {
					System.out.println("please enter a number greater than or equal to 2");
				}
			} catch (Exception e) {
				System.out.println("enter the valid formate data");
			}
			
			
		}
		int[] array=new int[l];
		
		System.out.println("Enter the age of  "+l+" employees");
		for(int i=0;i<array.length;i++) {
			while(array[i]<28||array[i]>40) {
				
				try {
					array[i]=Integer.parseInt(scanner.nextLine());
					if(array[i]<28||array[i]>40) {
						System.out.println("please enter a age between 28 to 40 "+array[i]+" is not accepted");
					}
				} catch (Exception e) {
					System.out.println("enter the valid formate data");
				}
				
				
			}
		}
		
		System.out.println("The average age is :"+new Demo().calculateAverage(array));
	
		
		scanner.close();
	}
}
