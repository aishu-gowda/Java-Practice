package com.practice;

public class StrongNumber {
 public static void main(String[] args) {
	int num=145;
	int temp=num;
	
	int sum=0;
	while(temp>0)
	{
		int fact=1;
		int dig=temp%10;
		for(int i=dig;i>0;i--)
		{
			
			fact = fact*i;
			
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(num==sum)
	{
		System.out.println(num+"is stttrong number");
	}
	else 
	{
		System.out.println(num+"num is not strong num");
	}
}
}
