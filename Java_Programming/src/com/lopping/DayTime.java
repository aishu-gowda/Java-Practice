package com.lopping;

import java.util.Scanner;

public class DayTime {
public static void main(String[] args) {
//	for(int i=1;i<=7;i++) {
//		System.out.println("day : "+ i);
//		{
//			for(int j=1;j<=24;j++) {
//				System.out.println(j+" hour");
//			}
//		}
//	}
	
	for(int i=2;i<=50;i++)
	{
		boolean isprime=true;
		for(int j=2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
                    isprime=false;					
				}
			}
			if(isprime)
			{
				System.out.println(i);
			}
		}
	}
	
	
}

