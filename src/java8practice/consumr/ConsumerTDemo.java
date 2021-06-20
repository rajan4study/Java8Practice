package java8practice.consumr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTDemo {
	
	public static void main(String args[]) {
		Consumer<Integer>display=a->System.out.print(a);
//		display.accept(10);
		
		Consumer<List<Integer>>modify=list->{
			for(int i=0;i<=list.size();i++) {
				list.set(i, list.get(i)*2);
			}
		};
		
		Consumer<List<Integer>>displayList=list->list.stream().forEach(a->System.out.println(a));
		
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//		displayList.accept(list);
//		modify.andThen(displayList).accept(list);
//		modify.andThen(null).accept(list);
		displayList.andThen(modify).accept(list);
	}

}
