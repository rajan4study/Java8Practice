package java8practice;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	public static void main(String...args) {
		BinaryOperator<Integer> operate=
				BinaryOperator.maxBy(
						(a,b)-> a>b?1:((a==0)?0:-1));
		System.out.println(operate.apply(7, 3));
		
		BinaryOperator<Integer> op=
				BinaryOperator.minBy(
						(a,b)->a>b?1:(a==0?0:-1));
		System.out.println(op.apply(3, 3));
	}

}
