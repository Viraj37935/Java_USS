package functiion;

import java.util.function.Function;

public class Function_2nd {

	public static void main(String[] args) {
		
		Function<Integer, Double> fun1 =(i)->{
			return Double.valueOf(i);
		};
		
		Function<Double, String> fun2=(i)->{
			return Double.toString(i);
		};
		
		Function<Integer, String> fun3=fun1.andThen(fun2);
		
		System.out.println(fun3.apply(68));
		System.out.println(fun3.apply(58).getClass());
	}

}
