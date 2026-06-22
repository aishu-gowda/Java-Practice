package com.hashmap;

public class main {
	public static void main(String[] args) {
School s = new School();

s.add(2, new Student(103,"aishu","CSE"));
s.add(1, new Student(123,"anu","iSE"));
s.add(3, new Student(203,"ammu","Ece"));
s.add(4, new Student(403,"arpi","mec"));

Student s1=new Student(111,"priya","aiml");

s.display();

s.remove(3);
s.update(1,s1);
s.search("aishu");
s.display();

	}
}
