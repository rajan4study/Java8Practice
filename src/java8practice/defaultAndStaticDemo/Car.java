package java8practice.defaultAndStaticDemo;

import java8practice.Zen;

public class Car implements Vehicle,FourWheeler{

	@Override
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHon();
		System.out.println("Car");
		
	}
	 Car getZen() {
		return this;
	}
	
//	int getZen(int i) {
//		return i;
//	}

	
}
