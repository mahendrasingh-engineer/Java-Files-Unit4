package answerNumber2;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
 public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String str="";
	
	System.out.println("Enter Student's Article\r\n"
			+ "");
	str=sc.nextLine();
	HashSet hs = new HashSet();
	HashSet hs2 = new HashSet();
	String[] strarr =str.split(" ");
	int ni=0;
	for(String a:strarr) {
		if(hs.add(a)) {
			ni++;
		}
	}
	System.out.println("Number of words"+strarr.length);
	System.out.println("Number of unique words :"+ni);
	
	
	//Iterator r=(Iterator) hs.iterator();
	System.out.println("The words are");
	for(String a:strarr) {
		if(hs2.add(a)) {
			System.out.println(a);;
		}
	}
//	Number of words 17
//	Number of unique words 14

	sc.close();
}
}
