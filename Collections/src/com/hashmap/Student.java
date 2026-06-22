package com.hashmap;

public class Student {
	int id;
  String name;
  String dept;
  public Student(int id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
  }
  public String toString()
  {
	  return id+" "+name+" "+dept;
  }
}
