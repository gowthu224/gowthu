package com.tutorial.automation;

import java.util.Arrays;

public class regexpstring {

	public static void main(String[] args) {
		String s="TN33ABC1293";
		String regexp="((?<=[a-zA-Z])(?=[0-9])|(?<=[0-9])(?=[a-zA-Z]))";
		String[] a=s.split(regexp);
		System.out.println(Arrays.asList(a));
		//System.out.println(a);   cant print array like this.
		}
	}


