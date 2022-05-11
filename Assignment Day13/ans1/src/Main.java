import java.util.ArrayList;
import java.util.List;
//from java.util.Set import Set as s;

import java.util.Iterator ;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>(100);
		for(int j=0;j<100;j++) {
			list.add((int) Math.floor(Math.random()*100));
		}
		Iterator<Integer> iterator  = list.iterator();
		
		int listItem;
		System.out.println("printing even numbers");
		while(iterator.hasNext()) {
			listItem=iterator.next();
			if(listItem%2==0) {
				System.out.println(listItem);
			}
		}
		iterator=list.iterator();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("printing ggreater than 9  numbers");
		while(iterator.hasNext()) {
			listItem=iterator.next();
			if(listItem>9) {
				System.out.println(listItem);
			}
		}
		iterator=list.iterator();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("printing all numbers");
		while(iterator.hasNext()) {
			listItem=iterator.next();
			
				System.out.println(listItem);
			
		}
		System.out.println();
	}
}
