package functional_interface;

import java.util.function.Function;

public class Function_Methods {
	
	/**
	 * Default Methods -> 
	 * 
	 * andThen() -> Apply current function, then next one.
	 * 
	 * commpose() -> Apply previous function first, then current.
	 * 
	 */

	public static void main(String[] args) {
		 
		 Function<String, Integer> lengthFun = s -> s.length();
	        System.out.println(lengthFun.apply("Viraj")); // 5
	        
	        
	        Function<Integer, Integer> square = (n) -> (n * n);
	        	
	        Function<Integer, Integer> doubleNum = (n) -> (2 * n);
	        
	        System.out.println(square.andThen(doubleNum).apply(5));
	        System.out.println(square.compose(doubleNum).apply(6));

	}

}
