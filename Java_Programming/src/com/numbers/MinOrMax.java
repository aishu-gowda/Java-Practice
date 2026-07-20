package com.numbers;
import java.util.Scanner;
public class MinOrMax {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" enter your number1");
	   int num1 = sc.nextInt();
	   System.out.println(" enter your number2");
	   int num2 = sc.nextInt();
	   
	   int max=(num1>num2)?num1:num2;
	   System.out.println(max+" is greater number");
	   int min=(num1<num2)?num1:num2;
	   System.out.println(min+" is lower number");
}
}
