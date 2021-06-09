package com.tutorial.automation;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="amma";
  String s2="";
  //System.out.println(s1.length());
  
  for(int i=s1.length()-1;i>=0;i--)
  {
	//  System.out.println(j);
	 // System.out.println(s1.charAt(i));
	  s2=s2+s1.charAt(i);
  }
  System.out.println(s2);
  if(s1.equals(s2))
  {
	  System.out.println("string is palindrome \n"+s1+"\n"+s2);
  }else
  {
	  System.out.println("string is not a palindrome \n"+s1+"\n"+s2);
  }
	}

}
