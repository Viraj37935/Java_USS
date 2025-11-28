package functiion;

import java.util.function.Function;

public class Function_1st {

	public static void main(String[] args) {

		Function<Integer, Integer> fun1 =Function.identity();
		System.out.println(fun1.apply(10));
		
		Function<String,String> fun2=Function.identity();
		System.out.println(fun2.apply("Hii Vraj"));
	}

}
