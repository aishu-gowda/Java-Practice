package com.numbers;
// also hcf
public class GCDof2Number {
public static void main(String[] args) {
	int a=12;
	int b=18;
	int max=0;
	int lim=(a<b)?a:b;
	for(int i=1;i<=lim;i++)
	{
		if(a%i==0 && b%i==0)
		{  
			
				max=i;	
		}
		
	}
	System.out.println(max);
	
//	other method euclideanformula  gcd(b,amod b)
	int temp;
	while(b!=0)
	{
		temp=b;
		b=a%b;
		a=temp;
	}
	 System.out.println(a);
}
}
