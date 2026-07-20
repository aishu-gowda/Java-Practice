package com.whileloop;

public class NumberOfDigit {
public static void main(String[] args) {
	int num=523;
	int count=0;
	int temp=num;
	while(temp!=0)
	{
		int digit = temp % 10;
		System.out.println("digit = "+digit);
		temp=temp/10;
		count++;
	}
	System.out.println("count = "+count);
//
//	while(num!=0)
//	{
//		num=num/10;
//		count++;
//	}
//	System.out.println(count);
	
	
	
}
}
