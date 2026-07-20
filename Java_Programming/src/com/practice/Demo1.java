package com.practice;

public class Demo1 {
public static void main(String[] args)
  {
//	int a=10;
//	int b=20;
	
//	swapping of 2 numbers with twmp
	
	
//	int temp;
//	temp=a;
//	a=b;
//	b=temp;
//	System.out.println(b+" b");
//	System.out.println(a+" a");
	
	
//	swaping without temp
	
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	System.out.println(b+" b");
//	System.out.println(a+" a");

	
	
//	Bitwise
	
	
//	int a=10;
//	int b=15;
//	System.out.println(a&b);
//	System.out.println(a|b);
	
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i=n;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=n-i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i=n;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=n-i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("----------------------------------");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	for(int i=n-1;i>0;i--)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
  }
}}
