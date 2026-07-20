package com.whileloop;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		 int i=1;
		for(int j=n;j>0;j--)
		{
			i=i*j;
		}
		 System.out.println(i);
	}
   
 
}
