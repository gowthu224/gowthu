package com.tutorial.automation;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sonatasoftware private ltd";
		String sub=s.substring(0, 6);
		System.out.println(sub);
		System.out.println(s.substring(7));
		System.out.println(s.subSequence(6, 26));
	}

}
