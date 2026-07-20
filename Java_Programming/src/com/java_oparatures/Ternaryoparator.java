package com.java_oparatures;

public class Ternaryoparator {
//	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		int d;
	
//    int money = 250;
//    System.out.println((money<=300)?"ngs":"amubur");
//	}
	
	
//	void add(int a,int b) {
//		int c= a + b;
//		System.out.println(c);
//	}
//	void multiplay(int c, int a) {
//		int d=c*a;
//		System.out.println(d);
//	}
//	void display() {
//		System.out.println("hy its me");
//	}
	
}
class Task1 extends Thread{
	int a=10;
	int b=20;
	int c;
	int d;
	void add(int a,int b) {
		int c= a + b;
		System.out.println(c);
	}
	void multiplay(int c, int a) {
		int d=c*a;
		System.out.println(d);
	}

	public void run() {
		add(a, b);
		multiplay(c,a);
	}

}
class Task2 extends Thread{
	void display() {
		System.out.println("hy its me");
	}
	public void run() {
		display();
	}
}
class Main{
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		t1.start();
		Task2 t2 = new Task2();
		t2.start();
	}
}

