package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Library {
 ArrayList <Book> list= new ArrayList<>();
   void addbook(Book b)
   {
	   list.add(b);
   }
   void display()
   {
	  for(Book b:list)
	  {
		  System.out.println(b.toString());
	  }
   }
   void removebook(int id)
   {
	   Iterator <Book> itr=list.iterator();
	   while(itr.hasNext())
	   {
		   Book b = itr.next();
		   if(b.id==id)
		   {
			   System.out.println("element removed "+b.name);
			   itr.remove();
			   return;
		   } 
	   }
   }
   void search(int id)
   {
	   for(Book b:list)
	   {
		   if(b.id==id)
		   {
			   System.out.println("element presennt");
			   break;
		   }
		   else
		   {
			   System.out.println("element not present");
		   }
	   }
   }
   void update(int id,double newprice)
   {
	   for(Book b:list)
	   {
		   if(b.id==id)
		   {
			   b.setPrice(newprice);
			   System.out.println("value updated");
			   break;
		   }
	   }
   }
   void sort()
   {
	   Collections.sort(list, new Comparator<Book>()
	   {

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.name.compareTo(o2.name);
		}  
	   });
   }
   void sorting()
   {
	   Collections .sort(list, new Comparator<Book>()
			   {
		          public int compare(Book b1,Book b2)
		          {
		        	  return (int) (b1.getPrice()-b2.getPrice());
		        	  
		          }
		          
		          
			   });
		   
	   
   }
   
}
