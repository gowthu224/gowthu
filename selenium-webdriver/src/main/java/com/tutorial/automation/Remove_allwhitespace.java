package com.tutorial.automation;

public class Remove_allwhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is          a toy";
		char[] c=s1.toCharArray();
	//	StringBuilder sb=new StringBuilder();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<c.length;i++)
		{
			if((c[i]!=' ')&&(c[i]!='\t'))
			{
				sb=sb.append(c[i]);
			}
		}
		System.out.println(sb);
		String str="hi     he    ll   o";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
