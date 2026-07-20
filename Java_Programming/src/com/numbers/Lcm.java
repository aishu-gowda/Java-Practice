package com.numbers;
//         (a*b)
//        gcd(b,a mod b)

public class Lcm {
	public static void main(String[] args)
	{
	int a=12;
	int b=18;
	int x=a;int y=b;
	
	int lim=(a<b)?b:a;
	 while(lim%a!=0||lim%b!=0)
	 {
		 lim++;
	 }
	 System.out.println(lim);

	
	while(b!=0)
	{
		int temp=b;
		b=a%b;
		a=temp;
		
	}
	int hcf=a;
	System.out.println(a);

		int lim1 =(x*y)/hcf;
      System.out.println(lim1);
	}
}
