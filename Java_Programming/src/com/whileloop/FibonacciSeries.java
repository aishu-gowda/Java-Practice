  package com.whileloop;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		 int n=5;
		    int n1=0;
		      int n2=1;
		   
		     while(n>0)
		     {
		    	 System.out.println(n1);
		    	 int temp=n1+n2;
		    	 n1=n2;
		    	 n2=temp;
		    	 n--;
		     }
		     
	}
    
	
}
