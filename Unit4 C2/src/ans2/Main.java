package ans2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		
		System.out.println("enter the number of bookings");
		int booking=sc.nextInt();
		for(int i=0;i<booking;i++) {
			System.out.println("Enter the available tickets:");
			t.setAvailableTickets(sc.nextInt());
			System.out.println("Enter the ticketid");
			t.setTicketid(sc.nextInt());
			System.out.println("Enter the price");
			t.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets");
			int noT=sc.nextInt();
			
			System.out.println("Available tickets:"+t.getAvailableTickets());
			System.out.println("Total amount:"+t.calculateTicketCost(noT));
			System.out.println("Available ticket after booking:"+t.getAvailableTickets());
			System.out.println("");
			System.out.println("");
			
//			 25
//			Total amount:500
//			Available ticket after booking:20
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
