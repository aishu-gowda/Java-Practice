package com.Pattern;


public class Pattern1 {
public static void main(String[] args) {
//	for(int i = 5;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	int n=5;
//	for(int  i=1; i<=n; i++) {
//		for(int j=1;j<=n;j++) {
//			if(i+j>n)
//			{ 
//				System.out.print("*");
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//			
//		}
//		System.out.println();
//	}
//	System.out.println("___________________________________________");
//	
	
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=5;j++)
		{
			if(j<i)
			{
				System.out.print("-");
			}
			else 
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	System.out.println("______________________________");
	
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i>=j) 
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println("______________________________");
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5-i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
