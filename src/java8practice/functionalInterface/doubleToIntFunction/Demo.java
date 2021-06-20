package java8practice.functionalInterface.doubleToIntFunction;

import java.util.function.DoubleToIntFunction;

public class Demo {
	
	public static void main(String arg[]) {
		DoubleToIntFunction dtif=a->(int)a;
		System.out.println(dtif.applyAsInt(98.9546851575));
	}

}
