package com.tutorial.automation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class lists_toHashmap {
	public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("apple");
	a.add("banana");
	a.add("grapes");
	a.add("kiwi");
	System.out.println(a);
	ArrayList<Integer> b=new ArrayList<Integer>();
	b.add(111);
	b.add(222);
	b.add(333);
	b.add(333);
	System.out.println(b);
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	for(int i =0;i<a.size();i++)
	{
		hm.put(b.get(i), a.get(i));
	}
	System.out.println(hm);
	Set s=hm.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}
	
	}

	}
	
	
	
	
