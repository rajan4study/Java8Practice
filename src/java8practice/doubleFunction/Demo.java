package java8practice.doubleFunction;

import java.util.function.DoubleFunction;

public class Demo {

	public static void main(String...args) {
		DoubleFunction<String> fun=x->"wow"+x;
		System.out.println(fun.apply(78.25));
	}
}
