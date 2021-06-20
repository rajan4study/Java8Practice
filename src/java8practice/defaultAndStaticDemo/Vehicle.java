package java8practice.defaultAndStaticDemo;

public interface Vehicle {

	default void print() {
		System.out.println("Vehicle");
	}
	
	static void blowHon() {
		System.out.println("horn");
	}
}
