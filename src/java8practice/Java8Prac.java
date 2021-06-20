package java8practice;

import java8practice.defaultAndStaticDemo.Car;

public class Java8Prac {
	
	public static void main(String[] args) {
		Java8Prac practice= new Java8Prac();
		
		Car car= new Car();
		
		//////without type declaration
		MathCal add=(a,b)->a+b;
		System.out.println("result 1: "+ practice.cal(5, 5, add));
		/////without type declaration
		MathCal subtract=(int a, int b)->a-b;
		System.out.println("result 2: "+ practice.cal(7, 5, subtract));
		////with curly braces for return
		MathCal multiplication=(a,b)->{return a*b;};
		System.out.println("result 3: "+ practice.cal(7, 5, multiplication));
		////return statment without curly braces
		MathCal div=(int a, int b)->a/b;
		System.out.println("result 4: "+practice.cal(100, 2, div));
		
		StringMani msg= message->System.out.println("hello "+message);
		msg.message("Rajan");
		StringMani msg2= message->System.out.println("bye "+message);
		msg2.message("toby");
		
		
	}

	interface MathCal{
		int manip(int a, int b);
	}
	interface StringMani{
		void message(String msg);
	}
	
	private int cal(int a,int b,MathCal mathCal) {
		return mathCal.manip(a, b);
	}
}
