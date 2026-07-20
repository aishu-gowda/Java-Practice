package com.lopping;

import java.util.Scanner;

public class Task1{
  public static void main(String[] args) {
	
	for (int i=10;i>0;i--) {
		System.out.print(i+",");
	}
	
	int sum=0;
	for(int i=1;i<=10;i++) {
		sum = sum+i;	
	}
	System.out.println(sum);
	
//	factorial
	
	int fact=1;
	Scanner sc = new Scanner(System.in); 
	System.out.println("enter a number");
	int a = sc.nextInt();
	for(int i=a;i>=1;i--) {
	fact=fact*i;
}
	System.out.println(fact);
	
//	2*2=2
	
	int tab=2;
	for(int i=1;i<=10;i++) {
		tab = 2*i;
		System.out.println("2 * "+i+"="+tab);
	}
	
// odd numbers from 1 to 10
	System.out.println("enter a num to check even or not");
	int e=sc.nextInt();
	int even=0;
	System.out.print("even num : ");
	for(int i=1;i<=e;i++) {
		if((even+i)%2==0) {
			System.out.print(i+",");
		}
//		else {
//			System.out.println("odd num ="+i);
//		}
//		
//		int prime = 1 ;
//	
//		System.out.println(" prime num :");
//		for(i=1;i<=20;i++) {
//			prime = prime+i;
//			if(i%prime==0 && i%1==0) {
//				System.out.println(i);
//			}
//		}
	}
}
}