package com.practice;

public class ArmStrongNumber {
	public static void main(String[] args) {
   int n=153;
   int temp=n;
   int count=0;
   int sum=0;
   while(temp>0)
   {
	 int dig=temp%10;
	 count++;
	 temp=temp/10;
   }
   temp=n;
   while(temp>0)
   {
	 int dig=temp%10;
	 int prod=1;
	 for(int i=count;i>0;i--)
	 {
	  prod=prod*dig;
	 }
	 sum=sum+prod;
	 temp=temp/10;
   }
   if(sum==n)
   {
	   System.out.println("armstrong num");
   }
  }
}
