
package com.tutorial.automation;

public class int_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=454;
		int n=a;
		int t=0;
		//String sb=new StringBuffer();
		String s="";
		while(a>0)
		{
			t=a%10;
			a=a/10;
			s=s+t;
		}
		System.out.println(s);
		int value=Integer.parseInt(s);
		System.out.println(value);
		if(n == value)
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}
	}

}
