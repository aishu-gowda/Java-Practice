package com.abcd;

public class BinarryPattren {
public static void main(String[] args) {
	for(int i=0;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j==1||j==3||j==5)
			{
				System.out.print("1");
			}
			else if(j==2||j==4)
			{
				System.out.print("0");
			}
		}
		System.out.println();
		
	}
	System.out.println("________________________________________________________________");
	for(int i=0;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if((i+j)%2==0)
			{
				System.out.print("0");
			}
			else if((i+j)%2!=0)
			{
				System.out.print("1");
			}
		}
		System.out.println();
		
	}
	System.out.println("__________________________________________________");
	for(int i=0;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==1||i==3||i==5)
			{
				System.out.print("1");
			}
			else if(i==2||i==4)
			{
				System.out.print("0");
			}
		}
		System.out.println();
		
	}
	System.out.println("__________________________________________________");
	for(int i=0;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if((i+j)%2==0)
			{
				System.out.print("1");
			}
			else if((i+j)%2!=0)
			{
				System.out.print("0");
			}
		}
		System.out.println();
		
	}
	System.out.println("__________________________________________________");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i+1;k++)
		{
			if((i+k)%2==0)
			{
				System.out.print("1");
			}
			else if((i+k)%2!=0)
			{
				System.out.print("0");
			}
		}
		System.out.println();
	
}
}}
