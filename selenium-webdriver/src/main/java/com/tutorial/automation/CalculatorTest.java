package com.tutorial.automation;

class Calculator{
	
	public int calculate(char c, int a, int b){
		if(c == '+') {
			return add(a,b);
		}else if(c == '*') {
			return multiply(a, b);
		}
		return 0;
	}
	
	private int add(int a, int b) {
		return a+b;
	}
	
	private int multiply(int a, int b) {
		return a*b;
	}
}


public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("--- "+calculator.calculate('+', 3, 4));
		System.out.println("--- "+calculator.calculate('*', 3, 4));
	}
}

