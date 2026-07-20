package com.java_oparatures;
import java.util.Scanner;

public class EventOrOdd {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("ENTER A NUMBER");
	int num = sc.nextInt();
//	if(num%2==0) {
//		System.out.println("number is even");
//	}
//	else {
//		System.out.println("number is odd");
//	}
	System.out.println((num%2==0)?"num is even":"num is odd");
}
}
