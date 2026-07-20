package com.whileloop;

public class Reversethenumber {
 public static void main(String[] args)
{
	int num=12345;
	int rev=0;
	int count=0;
	while(num!=0)
	{
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
		count++;
	}
	System.out.println(rev);
	System.out.println(count);	
}
}
