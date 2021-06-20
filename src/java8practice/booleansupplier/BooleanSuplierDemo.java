package java8practice.booleansupplier;

import java.util.function.BooleanSupplier;

public class BooleanSuplierDemo {
	
	public static void main(String arg[]) {
		BooleanSupplier bs=()->true;
		System.out.println(bs.getAsBoolean());
	}

}
