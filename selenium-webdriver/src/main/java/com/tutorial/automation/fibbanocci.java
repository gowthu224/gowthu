package com.tutorial.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class fibbanocci {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		System.out.println("You Entered   "+val);
		
		System.out.println("Enter string Line");
		String line = new Scanner(System.in).nextLine();
		System.out.println("You entere  "+line);
		
		
		System.out.println("Enter string Again");
		BufferedReader my_reader = new BufferedReader(new InputStreamReader(System.in));
	     String my_name = my_reader.readLine();
		System.out.println("Entered   "+my_name);
	     
	     
	     
//		int count =10;
//		int a=0;
//		int b=0;
//		int c=1;
//		for(int i=1;i<=10;i++)
//		{
//			a=b;
//			b=c;
//			c=a+b;
//			System.out.println(a);
//			
//		}

	}

}
