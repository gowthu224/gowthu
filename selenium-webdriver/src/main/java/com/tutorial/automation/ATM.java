package com.tutorial.automation;


abstract class MachineA{

 abstract void method1();
 public int num()
 {
	return 10;
	 
 }
 public static void main(String[] args) {
	 System.out.println("hello");
 }
	
}



public class ATM {
	
	public int cardno;
	private String pin;
	
	public String getPin() {
		return pin;
	}

	public void setPin(String p) {
		this.pin = p;
	}
	public static void main(String[] args) {
		ATM a=new ATM();
		a.setPin("1234");
		System.out.println(a.getPin());

	}

}

class MachineB{
	public static void main(String[] args) {
		 System.out.println("hello hii");
	 }
	
}

