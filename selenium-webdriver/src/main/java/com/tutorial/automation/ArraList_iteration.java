package com.tutorial.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraList_iteration {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("grapes");
		a.add("orange");
		a.add("kiwi");
		System.out.println(a);
		Iterator<String> it=a.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		for(String s:a)
		{
			System.out.println(s);
		}
		Collections.sort(a);
		System.out.println(a);
		
	}

}
