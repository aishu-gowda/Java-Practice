package com.numbers;

import java.util.Scanner;

public class Swppingoftwonumbers {
	public static void main(String[] args) {
		

    int a = 10;
    int b = 20;
    
    int x=a;
    a=b;
    b=x;
    System.out.println(a + " a");
    System.out.println(b + " b");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a1");
    int a1 = sc.nextInt();
    System.out.println("enter b1");
    int b1 = sc.nextInt();
    int x1 = a1;
    a1=b1;
    b1=x1;
    System.out.println(a1 + " a");
    System.out.println(b1 + " b");
	}
}
