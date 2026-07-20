package com.numbers;

public class HarshadNumber {
 public static void main(String[] args) {
	int num=12;
	int temp=num;
	int sum=0;
	while(temp>0)
	{
		int dig = temp%10;
		sum=sum+dig;
		temp=temp/10;
	}
	if(num%sum==0)
	{
		System.out.println("it is harshadNumber");
	}
	else {
		System.out.println("it is not harshadNumber");
	}
}
}
