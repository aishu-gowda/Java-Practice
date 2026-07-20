package com.lopping;

import java.util.Scanner;

public class PrimenumOrNot {
	public static void main(String[] args) {
		

  Scanner sc = new Scanner(System.in);
  System.out.println("enter a number");
  int a = sc.nextInt();
  boolean isprime=true;
  
  if(a<=1) {
	  isprime = false;
  }
  
  
  for(int i=2;i<=a/2;i++) {
	  if(a%i==0) {
		 isprime=false;
	  }
  }
  if(isprime) {
	  System.out.println("is prime ");
  }
  
  else {
	  System.out.println("not a prime");
  }
	}
}
