package com.tutorial.automation;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;

	    for (int i = 1; i <= rows; i++) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	}

}
