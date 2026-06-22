package com.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
		
Airport a = new Airport();

a.add(101,new Flight(2,"Banglore","Maldivs"));
a.add(103,new Flight(1,"Banglore","Kashi"));
a.add(104,new Flight(5,"Banglore","Maldivs"));

a.display();
System.out.println("________________");

//a.compare();
a.remove("Maldivs");
a.display();
	}
}
