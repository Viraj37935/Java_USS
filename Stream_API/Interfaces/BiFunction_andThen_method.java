package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_andThen_method {
	/**
	 * andThen() -> 
	 * 
	 * Perform First operation and After Excuting First then is perfom second ops.
	 * (First >> Second ops.)
	 */

	public static void main(String[] args) {
		  BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
		  
		  Function<Integer, Integer> square = n -> n * n;
		  
		  int result = multiply.andThen(square).apply(5, 2); 
		  System.out.println(result);
	}

}
