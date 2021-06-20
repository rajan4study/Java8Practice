package java8practice;

import java.util.function.BiPredicate;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class BiPredicateDemo {
	
	public static void main(String args[]) {
		BiPredicate<Integer, String> predicate1=(n,s)->{
			if(n==Integer.parseInt(s))
				return true;
			return false;
		};
		
		System.out.println(predicate1.test(2, "2"));
		
		
		BiPredicate<Integer,String> predicate2=(n,s)->{
			if(n>Integer.parseInt(s)) 
				return true;
			return false;
		};
		
		System.out.println(predicate1.test(3, "2"));
		
		BiPredicate<Integer,String> pd3=predicate1.and(predicate2);
		System.out.println(pd3.test(2, "2"));
		BiPredicate<Integer,String> pd4=predicate1.or(predicate2);
		System.out.println(pd4.test(2,"2"));
		
	}

}
