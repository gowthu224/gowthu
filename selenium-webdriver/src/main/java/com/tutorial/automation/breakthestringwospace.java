package com.tutorial.automation;

public class breakthestringwospace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="TN33ABC123@@";
		StringBuffer alpha=new StringBuffer(),num= new StringBuffer(),special=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alpha=alpha.append(s.charAt(i));
			}else if(Character.isDigit(s.charAt(i)))
			{
				num=num.append(s.charAt(i));
			}else
			{
				special=special.append(s.charAt(i));
			}

		}
		System.out.println("text---->"+s+"-------alpha---->"+alpha+"-----num------>"+num+"-----special chars--->"+special);
	}

}
