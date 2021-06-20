package java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class forEachStream {
	
	public static void main(String arg[]) {
//		Random random= new Random();
//		random.ints().limit(10).forEach(System.out::println);
		
//		List<Integer>integerList=Arrays.asList(1,2,2,2,3,3,4,4,5,6,7,8,9,10);
//		List<Integer>squareList=integerList.stream().map(i->i*i).distinct().collect(Collectors.toList());
//		squareList.forEach(System.out::println);
		
		
//		List<String>strList=Arrays.asList("","abc","","def");
//		long count=strList.stream().filter(s->s.isEmpty()).count();
//		System.out.println(count);
		
//		List<String> strList=Arrays.asList("","","asc","awd","");
//		long count= strList.parallelStream().filter(x->x.isEmpty()).count();
//		System.out.println(count);
//		
//		Random random= new Random();
//		random.ints().limit(10).sorted().forEach(System.out::println);
		
//		List<String> strList= Arrays.asList("","sss","","asc");
//		List<String> goodStrList=strList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
//		goodStrList.stream().forEach(System.out::println);
//		String str=strList.parallelStream().filter(x->!x.isEmpty()).collect(Collectors.joining(", "));
//		System.out.println(str);
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		IntSummaryStatistics intSum=numbers.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(intSum.getAverage());
		System.out.println(intSum.getCount());
		System.out.println(intSum.getMax());
		System.out.println(intSum.getMin());
		System.out.println(intSum.getSum());
		
		List<Integer>sqrlist=new ArrayList<>();
		
		for(Integer num:numbers) {
			sqrlist.add(num*num);
		}
		
		sqrlist.forEach(System.out::println);
		
		
		
	}

}
