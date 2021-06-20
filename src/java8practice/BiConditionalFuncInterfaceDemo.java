package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConditionalFuncInterfaceDemo {
	
	public static void main(String args[]) {
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=Arrays.asList(1,2,3,4);
		
		BiConsumer<List<Integer>, List<Integer>> 
		equals=(list1,list2)->{
			if(list1.size()!=list2.size()) {
				System.out.println("False");
			}else {
				for(int i=0;i<list1.size();i++) {
					if(list1.get(i)!=list2.get(i)) {
						System.out.println("False");
						return;
					}
				}
				System.out.println("True");
			}
		};
		//equals.accept(l1, l2);
		
		BiConsumer<List<Integer>,List<Integer>>
		disp=(list1,list2)->{
			list1.stream().forEach(System.out::println);
			list2.forEach(System.out::print);
		};
		
		equals.andThen(disp).accept(l1, l2);
	}

}
