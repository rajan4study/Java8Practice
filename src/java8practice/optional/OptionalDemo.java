package java8practice.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {
	
	public static void main(String...args) {
		OptionalDemo optionalDemo= new OptionalDemo();
//		Integer num1=Optional.empty();
		Integer num2=11;
		Optional<Integer>a=Optional.empty();
		Optional<Integer>b=Optional.of(num2);
		
		
		a.orElseGet(()->10);
		//a.map(n->n+=2);
		
//		System.out.println(b.orElseGet(()->100).toString());
		System.out.println(a .orElseThrow(NullPointerException::new));
		
//		Consumer<Integer> consOp=x->System.out.println(x);
//		a.ifPresent(x->consOp.accept(x));
		
		
		
		//System.out.println(optionalDemo.sum(a, b));
		
		
//		Optional<String>stringOp=Optional.of("rajN");
//		Optional<Optional<String>> opOfOp=Optional.of(stringOp);
//		Optional<String>stringop1=opOfOp.flatMap(n->n.map(String :: toLowerCase));
//		System.out.println(stringop1.get());
	}

	private Integer sum(Optional<Integer> a, Optional<Integer> b) {
//		System.out.println(a.isPresent());
//		System.out.println(a.isEmpty());
//		System.out.println(b.isPresent());
		Integer i=a.orElse(10);
		Integer j=b.get();
//		System.out.println(a.equals(b));
		b=b.filter(num->num%2==0);
		System.out.println(b);
		
		
//		a.e
		return i+j;
	}

}
