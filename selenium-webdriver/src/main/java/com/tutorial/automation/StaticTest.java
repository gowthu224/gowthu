package com.tutorial.automation;

public class StaticTest {
	static int i=10;
	int j=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i=20;
//		j=30;
		StaticTest s =new StaticTest();
		s.j=30;
		
		
	}

}
