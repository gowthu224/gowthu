package com.tutorial.automation;

import java.util.HashMap;

public class int_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,13,12,11,23,23,2,45,65,45,45,45};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int count=hm.get(a[i]);
				hm.put(a[i], count+1);
			}else
			{
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
	}
	

}
