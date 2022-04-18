package ans2;

public class Ticket {
	
	private int ticketid;
	private int price;
	private int availableTickets;
	
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
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		this.availableTickets = availableTickets;
		else
			System.out.println("invalid input");
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets<=availableTickets) {
			availableTickets-=nooftickets;
			return nooftickets*price;
		}
		if(nooftickets==availableTickets){
			int a=availableTickets;
			availableTickets=0;
			return a*price;
		}
		return -1;
	}
}
