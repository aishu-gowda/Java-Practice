package com.LinkedHashMap;

public class Flight {
  int seats;
  String dest;
  String source;
  public Flight(int seats, String dest, String source) {
	super();
	this.seats = seats;
	this.dest = dest;
	this.source = source;
  }
  public String toString()
  {
	  return seats+" "+dest+" "+source;
  }

}
