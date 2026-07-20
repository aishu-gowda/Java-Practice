package com.numbers;

public class HappyNumber {
  public static void main(String[] args) {
	int num=19;
	
	
	while(num!=1 && num!=4)
	{
		int temp=0;
	  while(num>0)
	   {
		int dig=num%10;
		temp=temp+dig*dig;
		
		num=num/10;
	   }
	  num=temp;
	 
	}
if(num==1)
{
	System.out.println("happy num");
}
else
{
	System.out.println("not a happy num");
}
	

}
}