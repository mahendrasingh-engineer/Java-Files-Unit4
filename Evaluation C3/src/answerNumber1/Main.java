package answerNumber1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static <E> void main(String[] args) {
		 int isbn=0;
		 String bookName;
		 String author;
		
		 ArrayList<Book> bb=new <Book>ArrayList<Book>();
		 Book b;
		
		Library library1=new Library();
		System.out.println(library1.viewAllBooks());
		boolean exit=false;
		int choice;
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Count number of books - by book name\r\n"
				+ "5.Exit\r\n"
				+ "");
		Scanner sc=new Scanner(System.in);
		while(!exit) {
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				
				while(isbn==0) {
					try {
						System.out.println("Enter the isbn no:");
						isbn=sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						// TODO: handle exception
						sc.nextLine();
						System.out.println("please enter valid number");
					}
				}
				
				
				System.out.println("Enter the book name:");
				bookName=sc.nextLine();
				System.out.println("Enter the author name:");
				author=sc.nextLine();
				
				System.out.println("");
				
				library1.addBook(new Book( isbn,  bookName,  author));
				isbn=0;
//				Enter the isbn no:
//					123
//					Enter the book name:
//					Java
//					Enter the author name:
//					Bruce Eckel
				break;
			case 2:
				bb=(ArrayList)library1.viewAllBooks();
				for(int ii=0;ii<bb.size();ii++) {
					b=bb.get(ii);
					System.out.println(b.getAuthor());
					System.out.println(b.getBookName());
					System.out.println(b.getIsbn());
					System.out.println(b.getClass());
				}
				break;
			case 3:
				
				System.out.println("Enter the author name:");
				author=sc.nextLine();
				bb=(ArrayList)library1.viewBooksByAuthor(author);
				if(bb.size()==0) {
					System.out.println("no auther found");
				}
				System.out.println(library1.viewBooksByAuthor(author));
				for(int ii=0;ii<bb.size();ii++) {
					b=bb.get(ii);
					System.out.println(b.getAuthor());
					System.out.println(b.getBookName());
					System.out.println(b.getIsbn());
					System.out.println(b.getClass());
				}
				break;
			case 4:
				System.out.println("Enter the book name:");
				bookName=sc.nextLine();
				System.out.println(library1.countNoOfBook(bookName));
				break;
			case 5:
				exit =true;
				break;
			default :
				System.out.println("please enter a valid choice");
				break;
			
			}
		}
		sc.close();
	}
}
