package optinal_class;

import java.util.Optional;

public class Optinal_1 {
	
	/**
	 * Optional<T> ->  is a container class that may or may not contain a value. It is mainly used to avoid NullPointerException (NPE).
	 * Introduced in Java 8.
	 * 
	 * How Optional Works? -> 
	 * 
	 * Check value exists.
	 * Return default value.
	 * Execute logic only when value present.
	 * Throw custom exception
	 */

	public static void main(String[] args) {
		  
		//String s = null;
		//System.out.println(s.length()); // Throw NullPointerException
		
		Optional<String> s1 = Optional.empty();
		System.out.println(s1.orElse("Default"));

	}

}
