package com.linkedlist;

public class main {
	public static void main(String[] args) {
		

	TicketBooking tb = new TicketBooking();
	tb.bookTicket(new Ticket(1009,"KGF",890));
	tb.bookTicket(new Ticket(23,"kantara",1000));
	tb.bookTicket(new Ticket(2080,"manjumel boys",500));
	
	tb.displayTickets();
	System.out.println("_________________");
	tb.cancelTicket("manjumel boys");
	System.out.println("_________________");
	tb.searchTicket(23);
	System.out.println("_________________");
	tb.updateSeat(1009, "KGF - Chapter:2");
	System.out.println("_________________");
	}
}
