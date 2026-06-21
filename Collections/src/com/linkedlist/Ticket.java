package com.linkedlist;

public class Ticket {
 int num;
 String movie;
 double price;
 public Ticket(int num, String movie, double price) {
	super();
	this.num = num;
	this.movie = movie;
	this.price = price;
 }
 public String toString()
 {
	 return num+" "+movie+" "+price;
 }
 
}
