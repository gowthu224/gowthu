package com.tutorial.automation;

public class recursion {
	public static int factorial(int a)
	{
	if(a == 1)
	{
		return 1;
	}else
	{
		int r=a*factorial(a-1);
		System.out.println(r);
		return(r);
		
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(factorial(a));
	}

}
