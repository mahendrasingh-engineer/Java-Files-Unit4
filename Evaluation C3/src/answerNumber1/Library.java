package answerNumber1;

import java.util.ArrayList;
import java.util.List;

public class Library {
	ArrayList<Book> booklist=new <Book>ArrayList<Book>();
	
	
	public void addBook(Book book) {
		booklist.add(book);
	}
	
	public boolean isEmpty() {
		 return booklist.isEmpty();
	 }
	
	public List<Book> viewAllBooks(){
		return booklist;
	}
	
	public List<Book> viewBooksByAuthor(String author ) {
		ArrayList<Book> books=new <Book>ArrayList<Book>();
		for(int i=0;i<booklist.size();i++) {
			if(booklist.get(i).getAuthor()==author) {
				books.add(booklist.get(i));
				System.out.println((booklist.get(i).getBookName()+"\n"+author));
			}
		}
		return books;
	}
	
	public int countNoOfBook(String bname) {
		int i=0;
		for(int ii=0;ii<booklist.size();ii++) {
			if(booklist.get(ii).getBookName()==bname) {
				i++;
			}
			System.out.println((booklist.get(ii).getBookName()+bname));
		}
		return i;
	}
		
}
