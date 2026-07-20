package com.conditionalstatements;
import java.util.Scanner;
public class Conditionifelseif {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" enter your percentage");
	 double p = sc.nextDouble();
	 if(p>=80) {
		 System.out.println("FIRST PLACE");
	 }
	 else if(p<80 && p>=60) {
		 System.out.println("first clASS");
	 }
	 else if(p<60) {
		 System.out.println("fail");
	 }
	 
}
}
