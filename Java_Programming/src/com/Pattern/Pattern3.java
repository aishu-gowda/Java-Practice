package com.Pattern;

public class Pattern3 {
	public static void main(String[] args) {
		

    for(int i=1;i<=5;i++)
    {
    	for(int j=1;j<=5-i;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    System.out.println("______________________________");
    for(int i=5;i>=1;i--)
    {
    	for(int j=1;j<=5-i;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    System.out.println("______________________________");
    
//    for(int i=1;i<=6;i++)
//    {
//    	for(int j=1;j<=6-i;j++)
//    	{
//    		System.out.print("*");
//    	}
//    	for(int k=1;k)
//    }
    for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=5;j++)
		{
			if(j<i)
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	System.out.println("______________________________");
	
	for(int i=5;i>=1;i--)
	{   
		for(int j=1;j<=i;j++)
		{
			System.out.print("-");
		}
		for(int k=1;k<=5-i;k++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	System.out.println("______________________________");
	
	for(int i=0;i<=4;i++)
	{
		 System.out.println("*");
	}
	for(int i=0;i<=4;i++)
	{
		 System.out.print("* ");
	}
	System.out.println();
	System.out.println("______________________________");
	
	for(int i=1;(i<=4);i++)
	{
		System.out.print("* ");
	}
	for(int j=1;j<=4;j++)
	{
		System.out.println("*");
	}
	System.out.println("______________________________");
	
	int z=5;
	for(int i=1;i<=z;i++)
	{
		for(int j=1;j<=z;j++)
		{   
			 if(i==z||j==z)
			{
				System.out.print(" *");
			}
		    else if(j<z)
			{
			System.out.print(" _");
		    }
			
		}
		System.out.println();
		
	}
	int z1=5;
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			 if(i==z1||j==z1)
			{
				System.out.print(" *");
			}
		    else if(j<z1)
			{
			System.out.print(" ");
		    }
			
		}
		System.out.println();
		
	}
	System.out.println("______________________________");
	
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			 if(i==z1||j==z1)
			{
				System.out.print(" *");
			}
		    else if(j<z1)
			{
			System.out.print(" ");
		    }
			
		}
		System.out.println();
		
	}
	System.out.println("______________________________");
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			 if(i==1||j==z1)
			{
				System.out.print(" *");
			}
		    else if(j<z1)
			{
			System.out.print(" ");
		    }
			
		}
		System.out.println();
		
	}
	System.out.println("______________________________");
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			 if(i==1||i==z1||j==1||j==z1)
			{
				System.out.print(" *");
			}
		    else if(j<z1)
			{
			System.out.print(" ");
		    }
			
		}
		System.out.println();
		
	}
	System.out.println("______________________________");
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" 1x");
			}
		}
		System.out.println();
	}
	System.out.println("______________________________");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==5-i+1)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println("______________________________");
	
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			 if(i==1||i==z1||i==j)
			{
				System.out.print(" *");
			}
		    else if(j<z1)
			{
			System.out.print(" ");
		    }
			
		}
		System.out.println();
		
	}
	System.out.println("______________________________");
	for(int i=1;i<=z1;i++)
	{
		for(int j=1;j<=z1;j++)
		{   
			if(j==1||i==j||j==5-i+1||j==z1)
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
	System.out.println("______________________________");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==1||i==j||j==5+1-i) 
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
	System.out.println("______________________________");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==3||j==3-i+1||i==j+2) 
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
  }
}

