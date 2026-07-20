package com.practice;

public class HarshadNumber {
	public static void main(String[] args) {
		
int num=18;
int temp=18;
int sum=0;
   while(num>0)
   {
	   int dig=num%10;
	   sum=sum+dig;
	   num=num/10;
   }
   if(temp%sum==0)
   {
	   System.out.println("harshad number");
   }
   else
   {
	   System.out.println("not harshad number");
   }
}
}
