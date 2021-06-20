package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String...x) {
		List<Integer> arrList= Arrays.asList(1,2,3,4,5,6,7,8);
//		eval(arrList,n->true);
//		eval(arrList,n->n%2==0);
		eval(arrList,n->n>3);
	}

	private static void eval(List<Integer> arrList, Predicate<Integer> predicate) {
		for(Integer i:arrList) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}
		
	}
}
