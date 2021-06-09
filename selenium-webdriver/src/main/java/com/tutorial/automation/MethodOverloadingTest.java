package com.tutorial.automation;
//OverLoading
//Create a Calculator class, Overload the method, add() as mentioned below
//Public void add(int a,int b)
//Public void add(float a,int b)
//Public float add(double a,double b)
//Public String add(String a,String b)


public class MethodOverloadingTest {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(float a,int b)
	{
		System.out.println(a+b);
	}
	public float add(double a,double b)
	{
		return (float) (a+b);
		
	}
	public String add(String a,String b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTest m=new MethodOverloadingTest();
		m.add(5,5);
		m.add(5.5f,5);
		System.out.println(m.add(12345.1234, 1234.1234));
		System.out.println(m.add("gowthami", "selvam"));

	}

}
