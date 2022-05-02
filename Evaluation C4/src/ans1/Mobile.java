package ans1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		ArrayList<String> s=new ArrayList<>();
		s.add(model);
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);
			return "Mobile added successfully";
		}
		mobiles.put(company,s );
		
		
		
		return "Mobile added successfully";
		//this method will take a string as a company name and its model as an //argument.
		//ex: "apple", "Iphone13"
		//add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
		//if the company name already exists then their model should be added to the //existing list.
		//This method should return a message "Mobile added successfully" after //adding a mobile.
		}
		public List<String> getModels(String company)throws InvlidMobileException{
			
			if(mobiles.containsKey(company)) {
				return mobiles.get(company);
			}else {
				throw new InvlidMobileException();
			}
		//This method return the list of all the models of the supplied company
		//if we supply any invalid company name then it should throw a checked exception
		}
		
		
		
		public static void main(String[] args) {
			Mobile mobile=new Mobile();
			mobile.addMobile("apple", "oo5MSGPixel-CoWi");
			mobile.addMobile("apple", "Iphone 12");
			mobile.addMobile("apple", "Ipad_o342");
			
			mobile.addMobile("mi", "redmi6");
			mobile.addMobile("mi", "redmi9i");
			
			try {
				System.out.println(mobile.getModels("apple"));
				System.out.println(mobile.getModels("mi"));
				
			} catch (InvlidMobileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main method ended normally");
		}
		
}
