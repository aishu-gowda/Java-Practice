package com.numbers;

public class ArmstrongNumber {
  public static void main(String[] args) {
	int num =153;
	int temp=num;
	int sum=0;
	int count=0;
	
	while(temp>0)
	{
		count++;
		temp=temp/10;
	}
	
	temp=num;
	while(temp>0)
	{   
		int dig = temp%10;
		
		int prod=1;
		for(int i=1;i<=count;i++)
		{
			prod=prod*dig;
		}
		
		sum=sum+prod;
		temp=temp/10;
	}
	
	if(num==sum)
	{
		System.out.println("it is armstrong num");
	}
	else 
	{
		System.out.println(" not a armstrong num");
	}
}
}
