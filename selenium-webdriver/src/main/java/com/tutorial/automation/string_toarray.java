package com.tutorial.automation;

public class string_toarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is a toy";
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++)
		{
		System.out.println(ss[i]);
	}
System.out.println(ss.length);
//System.out.println(s.charAt(0));
}
}
