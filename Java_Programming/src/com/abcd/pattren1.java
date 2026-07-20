package com.abcd;

public class pattren1 {
public static void main(String[] args) {
	int n=5;
	char c='A';
	for( int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(c + " ");
			c++;
		}
		System.out.println();
	}
	System.out.println("___________________________________________");
	
	for( int i=1;i<=n;i++)
	{   char c1='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(c1 + " ");
			c1++;
		}
		System.out.println();
	}
	System.out.println("___________________________________________");
	char c3='A';
	for( int i=1;i<=n;i++)
	{   
	   
		for(int j=1;j<=i;j++)
		{
			System.out.print(c3 + " ");
		
		}
		 c3++;
		System.out.println();
	}
	System.out.println("___________________________________________");
	
	for(int i=1;i<=n;i++)
	{   
		char c2='A';
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print(c2);
			c2++;
		}
		System.out.println();
	}
	System.out.println("___________________________________________");
	
	for( int i=1;i<=n;i++)
	{   char c5='A';
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print(" ");
			
		}
		for(int k=1;k<=(2*i-1);k++)
		{  
			System.out.print(c5);
			if(k<i)
			{
				c5++;
			}
			else
			{
				c5--;
			}
		}
		System.out.println();
			
	}
		
		
	}

}

