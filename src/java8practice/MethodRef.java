package java8practice;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
	public static void main(String s[]) {
		List<String> list= new ArrayList<>();
		list.add("abc");
		list.add("efg");
		list.add("hij");
		list.forEach(System.out::println);
	}

}
