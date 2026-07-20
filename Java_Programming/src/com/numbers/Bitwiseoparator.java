package com.numbers;

public class Bitwiseoparator {
	public static void main(String[] args) {
		 int a=7,b=9;
		 System.out.println(a&b);
		 System.out.println(a|b);
		 System.out.println(a^b);
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println(a + " a value");
		 System.out.println(b + " b value");
		 int x=100;
		 System.out.println(~x);
	}
   
    
}
