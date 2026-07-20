package com.practice;

public class Pattren1 
{
   private static final char[] number = null;

   public static void main(String[] args)
   {
//	for(int i=1;i<=5;i++)
//	{   
//		for(int j=1;j<=5;j++)
//		{  
//			if(i%2==0&&j%2==0)
//			{
//				System.out.print("*");
//			}
//			else
//			{
//				System.out.print("-");
//			}
//		}
//		System.out.println();
//	}
	   
	   
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	 for(int i=4;i>0;i--)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	  System.out.println("----------------------------------");
	  
	  
	  
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=4-i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   
	   
	   for(int i=1;i<=4;i++)
	   {
		   for(int j=1;j<=4;j++)
		   {
			   if(i<=j)
			   {
				   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
			   
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
//	   Number
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j +" ");
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   
	   for(int i=5;i>0;i--)
	   {
		   for(int j=1;j<=i;j++) 
		   {
			   System.out.print(j+"");
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   int number =1;
	   for(int i=1;i<=5;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(number +" ");
			   number++;
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   
	   for(int i=1;i<=5;i++)
	   {
	  
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print(" ");
		   }
		  
//		   System.out.println();
		   for(int j=1;j<=2*i-1;j++)
		   {
			   if(j==1||j==(2*i-1)||i==5) {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			   
		   }
		  
		 
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   int n=4;
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=7;j++)
		   {
			   if(i==4 ||j==n-i+1||j==n+i-1)
			   {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
	   System.out.println("----------------------------------");
	   for(int i=1;i<=5;i++)
	   {
	  
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print(" ");
		   }
		   
		   for(int j=1;j<=2*i-1;j++)
		   {
			   if(j==1||j==(2*i-1)) {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			   
		   }
		   System.out.println();
   }
	   for(int i=4;i>=1;i--)
	   {
	  
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print(" ");
		   }
		  

		   for(int j=1;j<=2*i-1;j++)
		   {
			   if(j==1||j==(2*i-1)) {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			   
		   }
		   System.out.println();
   }
	   System.out.println("_____________________________________________________________-");
	   int n1=4;
	   for(int i=1;i<=n1;i++)
	   {
		   for(int j=1;j<=7;j++)
		   {
			   if(j==n1-i+1||j==n1+i-1)
			   {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			  
		   }
		   System.out.println();
	   }
	 
	   for(int i1=n1-1;i1>0;i1--)
	   {
		   for(int j=1;j<=7;j++)
		   {
			   if(i1==4 ||j==n1-i1+1||j==n+i1-1)
			   {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
   }
	   System.out.println("_____________________________________________________________-");
	   for(int i=1;i<=5;i++)
	   {
	  
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print(" ");
		   }
		   
		   for(int j=1;j<=2*i-1;j++)
		   {
			  
				   System.out.print("*");
			  
			   
		   }
		   System.out.println();
   }
	   for(int i=4;i>=1;i--)
	   {
	  
		   for(int j=1;j<=5-i;j++)
		   {
			   System.out.print(" ");
		   }
		  

		   for(int j=1;j<=2*i-1;j++)
		   {
			   
				   System.out.print("*");
			   
			   
		   }
		   System.out.println();
   }
	  
   }
   }
   
