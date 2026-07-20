package com.whileloop;

public class Paindrome {
 public static void main(String[] args) {
	int stnum=12321;
	int temp=stnum;
	int rev=0;
	while(temp!=0)
	{
		int dig = temp%10;
	    rev = rev*10+dig;
	    temp=temp/10;
	}
	System.out.println(rev+"="+stnum);

	
}
}
