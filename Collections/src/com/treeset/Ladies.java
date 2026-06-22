package com.treeset;

public class Ladies {
int lid;
String lname;
double price;
public Ladies(int lid, String lname, double price) {
	super();
	this.lid = lid;
	this.lname = lname;
	this.price = price;
}
 public String toString()
 {
	return lid+" "+lname+" "+price;
 }
}
