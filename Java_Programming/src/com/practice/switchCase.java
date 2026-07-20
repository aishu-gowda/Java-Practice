package com.practice;
import java.util.Scanner;
public class switchCase {
static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
		 int a=10;
		 int b=20;
		System.out.println(" enter any sign");
	char symbol=sc.next().charAt(0);
	 int res;
	 switch(symbol)
	 {
	 case '+':res=a+b;
	 System.out.println("addition"+res);
	 break;
	 case '-':res=a-b;
	 System.out.println("subtraction"+res);
	 break;
	 case '*':res=a*b;
	 System.out.println("multiplication"+res);
	 break;
	 case '/':res=a/b;
	 System.out.println("division"+res);
	 break; 
	 case '%':res=a%b;
	 System.out.println("modules"+res);
	 break;
	 default:System.out.println("unkown symbol");
	 }
	 }
		
}
