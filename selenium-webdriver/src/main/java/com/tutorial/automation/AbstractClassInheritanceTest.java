package com.tutorial.automation;

abstract class Vehicle{
	abstract void speed();
}

class TwoWheeler extends Vehicle{
	@Override
	void speed() {
		System.out.println("2 Wheeler");
	}
}

class FourWheeler extends Vehicle{
	@Override
	void speed() {
		System.out.println("4 Wheeler");
	}
}



public class AbstractClassInheritanceTest {

	public static void main(String[] args) {
		Vehicle v = new TwoWheeler();
		v.speed();
		
		Vehicle v1 = new FourWheeler();
		v1.speed();
		
		TwoWheeler tw1 = new TwoWheeler();
		tw1.speed();
		
		
	}
}
