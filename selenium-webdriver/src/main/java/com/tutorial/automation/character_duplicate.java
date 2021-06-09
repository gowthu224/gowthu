package com.tutorial.automation;

import java.util.HashMap;

public class character_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ththis     Iklpp  pppp";
		char[] c=s.toCharArray();
		System.out.println(c.length);
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++)
		{
			if((c[i]!='\t')&&(c[i]!=' '))
			{
			if(hm.containsKey(c[i]))
			{
				int count=hm.get(c[i]);
				hm.put(c[i], count+1);
				
			}else
				{
					hm.put(c[i], 1);
				}
}

	}
		System.out.println(hm);
}
}
