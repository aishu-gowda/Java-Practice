package com.arraylist;

public class Book {
 
	 int id;
	 String name;
	 private double price;
	 public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double peice) {
		 
	 }
	 public String toString()
	 {
		return id+" "+name+" "+price;
		 
	 }
	
}
