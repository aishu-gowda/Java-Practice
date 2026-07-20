package com.conditionalstatements;
import java.util.Scanner;
public class Conditionswitch {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a value");
		 int a = sc.nextInt();
		 System.out.println("enter b value");
		 int b = sc.nextInt();
         int res;
         System.out.println("choose oparation + or - or * or /");
         char symbol = sc.next().charAt(0);
 
  switch(symbol) {
  case '+': res=a+b;
  System.out.println("adtn = "+res);
  break;
  case '-': res=a-b;
  System.out.println("subtn = "+res);
  break;
  case '*': res=a*b;
  System.out.println("mptn = "+res);
  break;
  case '/': res=a/b;
  System.out.println("divtn = "+res);
  break;
  
  default : System.out.println("unknown symbol");
  }
 }
}