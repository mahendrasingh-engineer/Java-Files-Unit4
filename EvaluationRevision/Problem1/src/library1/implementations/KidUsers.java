package library1.implementations;

import library1.interfaces.LibraryUser;

public class KidUsers implements LibraryUser{
	int age ;
	String bookType;
	
	@Override
	public void registerAccount() {
		if (age <= 12) {
			System.out.println("You have successfully registered under a Kids Account" );
		}else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
}
