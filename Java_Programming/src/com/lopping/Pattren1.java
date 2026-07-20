package com.lopping;

public class Pattren1 {
public static void main(String[] args) {
//	outer for rows
//	inner for colomn
//	for(int i=1;i<=5;i++)
//	{
//		for(int j =1;j<=5;j++) 
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=i;j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("_________________________________________________________");
	
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}	
	System.out.println("_________________________________________________________");
	for(int i=1;i<=5;i--)
	{
		for(int j=1;j<=5;j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}	
	System.out.println("_________________________________________________________");
	
	  
}
}