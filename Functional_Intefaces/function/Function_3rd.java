package functiion;

import java.util.function.Function;

public class Function_3rd {

	public static void main(String[] args) {

		Function<Integer, Double> fun=(t)->{
			System.out.println("After");
			return Double.valueOf(t);};
		
		
		Function<String, Integer> fun2=(t)->{
			System.out.println("Before");
			return Integer.parseInt(t);};
		                             
		 Function<String, Double> fun3=fun.compose(fun2);
		 
		 System.out.println(fun3.apply("12"));

	}

}
