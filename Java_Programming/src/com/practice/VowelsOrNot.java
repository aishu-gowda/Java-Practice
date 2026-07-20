package com.practice;

import java.util.Scanner;

public class VowelsOrNot {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) 
{
	System.out.println("enter your Alphabet");
	char n=sc.next().charAt(0);
	if(n<='Z'||n>='A'||n>='z'||n<='a')
	{
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='U'||n=='O'||n=='I'||n=='E'||n=='A')
		{
			System.out.println("entered alphabet is vowel");
		}
		else
		{
			System.out.println("its a consonent");
		}
	}
}
}
