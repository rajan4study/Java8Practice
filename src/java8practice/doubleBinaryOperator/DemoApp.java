package java8practice.doubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DemoApp {
	
	public static void main(String args[]) {
		DoubleBinaryOperator dboAdd=(a,b)->{
			return a+b;
		};
		System.out.println(dboAdd.applyAsDouble(1,2));
		DoubleBinaryOperator dboSub=(a,b)->{
			return a-b;
		};
		System.out.println(dboSub.applyAsDouble(1,2));
		
		dboAdd=(a,b)->{
			return a*b;
		};
		
		System.out.println(dboAdd.applyAsDouble(1,2));
	}

}
