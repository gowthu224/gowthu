package com.tutorial.automation;

import java.util.HashMap;

public class string_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is boy this is girl girl toy";
		String[] s=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0; i<s.length; i++)
		{
		if(hm.containsKey(s[i]))
		{
			int c=hm.get(s[i]);
			hm.put(s[i],c+1);
			
		}else
		{
			hm.put(s[i],1);
		}
		
	}
		System.out.println(hm);
}
}
