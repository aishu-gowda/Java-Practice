package com.numbers;

public class DuckNumber {
public static void main(String[] args) {
	int num=1030;
	int count=0;
	while(num>0)
	{
		int dig=num%10;
		if(dig==0)
		{
			count++;
		}
		num=num/10;
	}
	if(count>0) {
	System.out.println(" its a duck number");
	}
	else
	{
		System.out.println("its not a duck number");
	}
}
}
//	
//	String n="1030";
//	boolean isduck=false;
//	int c=0;
//	int cc=0;
//	for(int i=1;i<n.length();i++)
//	{
//		if(n.charAt(0)=='0')
//		{  
//			c++;
//			System.out.println(" not a duck num");
//			break;
////			if we use return over here the prog exec will stop it self
//		}
//		else if(n.charAt(i)=='0')
//		{   
//			cc++;
//			isduck=true;
//			break;
//	    }
//	}
//	if(cc>0||c==0)
//	{
//		System.out.println("its a duck num");
//	}
//	else
//	{
//		System.out.println("its not");
//	}
//	
//}}
