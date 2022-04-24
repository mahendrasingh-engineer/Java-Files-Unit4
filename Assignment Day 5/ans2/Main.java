package ans2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ticket t1= new Ticket();
		
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter no of bookings");
	     int bookings = sc.nextInt();
	     
	     System.out.println("Enter the available tickets");
	     Ticket.availableTickets = sc.nextInt();
	     
	     System.out.println("Enter the ticket-id");
	     t1.ticketid = sc.nextInt();
	     
	     System.out.println("Enter the price");
	     t1.price = sc.nextInt();
	     
	     System.out.println("no of Available tickets:"+Ticket.availableTickets);
	     
	     
	     
	     for(int i=0;i<bookings;i++) {
	    	 System.out.println("Enter the no of tickets");
		     int nOfT = sc.nextInt();
		     System.out.println("Total amount  :"+t1.calculateTicketCost(nOfT));
		     System.out.println( "Available ticket after booking  :"+Ticket.availableTickets);
	     }
	     
	     //Enter no of bookings: 2 Enter the available tickets: 25 Enter the ticketid: 123 Enter the
	     //price: 100 Enter the no of tickets: 5 Available tickets: 25
	     
	     sc.close();
	}
}








class Ticket{
	 int ticketid; 
	 int price; 
	 
	 public int calculateTicketCost(int nooftickets) {
		 int aaa=availableTickets;
		 if(availableTickets!=0) {
			 if(nooftickets<availableTickets) {
				 availableTickets-=nooftickets;
				 return price*nooftickets;
			 }
			 availableTickets=0;
			 return price*aaa;
		 }
		 
		 
		 
		 return -1;
	 }

//////////////////////////////////getter and setter methods/////////////////////////////////////////

	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	//////////////////////////static filed//////////////////////////////////////////////////////////
	static int availableTickets= 4;
}