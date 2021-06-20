package java8practice.doublePredicate;

import java.util.function.DoublePredicate;

public class Demo {
	
	public static void main(String args[]) {
		DoublePredicate dp1=x->{
			if(x>10)
				return true;
			return false;
		};
		
		DoublePredicate dp2=x->{
			if(x<10)
				return true;
			return false;
		};
		;
		System.out.println(dp1.test(50));
		
		DoublePredicate dp3=dp1.negate();
		System.out.println(dp3.test(50));
		
		DoublePredicate dp4=dp1.and(dp2);
		
		System.out.println(dp4.test(50));
		
		DoublePredicate dp5=dp1.or(dp2);
		System.out.println(dp5.test(50));
	}
	
	

}
