package com.practice;

import java.util.Scanner;

public class Tables {
static Scanner sc=new Scanner (System.in);
public static void main(String[] args) {
	System.out.println("enter a number");
	int a=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(a+"*"+i+"="+(a*i));
	}
}
}
