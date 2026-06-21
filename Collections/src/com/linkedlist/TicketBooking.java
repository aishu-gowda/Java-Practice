package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class TicketBooking {
  LinkedList<Ticket> list = new LinkedList<>();
  void bookTicket(Ticket t)
  {
	  list.add(t);
  }

void cancelTicket(String name)
{
	Iterator<Ticket> itr = list.iterator();
	{
		boolean found = false;
		while(itr.hasNext())
		{   
			
			Ticket t =itr.next();
			
			if(t.movie==name)
			{
				itr.remove();
				found=true;
				System.out.println("data removed" + t);
				break;
			}
		}
		if(!found)
		{
			System.out.println("element is not present");
		}
	}
}

 void searchTicket(int id )
 {
	 for(Ticket t:list)
	 {
		 if(t.num==id)
		 {
			 System.out.println("found");
			 break;
		 }
	 }
 }

 void displayTickets()
 {

	 for(Ticket t:list)
	 {
		 System.out.println(t);
	 }
	 
 }

void updateSeat(int id , String name)
{

	 for(Ticket t:list)
	 {
		 if(t.num==id)
		 {
			t.movie=name;
			System.out.println("movie updated");
			 break;
		 }
	 }
}
}
