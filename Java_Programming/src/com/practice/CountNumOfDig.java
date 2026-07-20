package com.practice;

public class CountNumOfDig {
public static void main(String[] args) {
	int num = 1234;
	int temp=num;
	int count=0;
	while(temp>0)
	{
		int dig=temp%10;
		System.out.println("digit is"+dig);
		count++;
		temp=temp/10;
	}
	System.out.println(count);
}
}
