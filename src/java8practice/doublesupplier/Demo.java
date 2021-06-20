package java8practice.doublesupplier;

import java.util.function.DoubleSupplier;

public class Demo {
	
	public static void main(String arg[]) {
		DoubleSupplier ds=()->Math.random();
		System.out.println(ds.getAsDouble());
	}

}
