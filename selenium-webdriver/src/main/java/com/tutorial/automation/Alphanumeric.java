package com.tutorial.automation;

public class Alphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="al23B1@yY";
		
		if(s1.matches("[a-zA-Z0-9]+"))
				{
			System.out.println(s1+"is alphanumeric");
				}else
				{
					System.out.println(s1+"is not alphanumeric");
				}
		String s="ABCDGVFD";
		String u="abchndg"; 
		System.out.println(s.toLowerCase());
		System.out.println(u.toUpperCase());
	}

}
