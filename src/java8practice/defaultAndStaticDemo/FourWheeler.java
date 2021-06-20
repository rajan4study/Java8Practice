package java8practice.defaultAndStaticDemo;

public interface FourWheeler {

	default void print() {
		System.out.println("4");
	}
}
