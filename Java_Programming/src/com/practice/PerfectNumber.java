package com.practice;

public class PerfectNumber {
public static void main(String[] args) {
	int n=9;
	int sum=0;
	for(int i=1;i<=n-1;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		System.out.println("perfect num");
	}
	else
	{
		System.out.println("not a perfect num");
	}
}
}
