package com.tutorial.automation;

public class arnstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153,t=0,s=0;
		int n=a;
		while(a>0)
		{
			t=a%10;
			a=a/10;
			s=s+(t*t*t);
			
		}
		
		System.out.println(s);
		if(n == s)
		{
			System.out.println("it is an armstrong number");
		}else
		{
			System.out.println("it is not an armstrong number");
		}
	}

}
