package com.practice;

public class Fibonacchi {
public static void main(String[] args) {
	int n=10;
	int n1=0;
	int n2=1;
	for(int i=10;i>0;i--)
	{
		System.out.println(n1);
		int temp = n1+n2;
		n1=n2;
		n2=temp;
		n--;		
	}
}
}
