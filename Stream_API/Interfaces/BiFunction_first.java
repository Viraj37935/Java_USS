package functional_interface;

import java.util.function.BiFunction;

public class BiFunction_first {
	
	/**
	 * BiFunction is a functional interface
	 * Perform operation on two values
	 * Combine 2 objects
	 * Used internally in Streams
	 */

	public static void main(String[] args) {
		 
		BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;
		
		System.out.println("Addition:" + add.apply(10, 25));
		
		 BiFunction<String, String, String> longer = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;
		 
		 System.out.println(longer.apply("Java", "Developer"));
	}

}
