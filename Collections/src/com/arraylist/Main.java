package com.arraylist;

public class Main {
	public static void main(String[] args) {
		 Library l =new Library();
		 l.addbook(new Book(23,"horror",234));
		 l.addbook(new Book(12,"love",50));
		 l.addbook(new Book(3,"crime",250));
		 
		 l.display();
		 System.out.println("_____________________________");
		 l.removebook(3);
		 System.out.println("_____________________________");
	     l.display();
	     System.out.println("_____________________________");
		 l.search(23);
		 System.out.println("_____________________________");
		 l.update(12, 10);
		 System.out.println("_____________________________");
		 System.out.println("after sorting by name");
		
		 l.addbook(new Book(3,"crime",250));
		 l.sort();
		 l.display();
		 System.out.println("_____________________________");
		 System.out.println("sorting by price");
//		 l.sorting();
//		 l.display();
	}
}
