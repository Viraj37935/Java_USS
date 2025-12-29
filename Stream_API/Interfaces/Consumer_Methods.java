package functional_interface;

import java.util.function.Consumer;

public class Consumer_Methods {
	
	/**
	 * Deault Methods -> 
	 * 
	 * andThen(Consumer after) -> Execute next Consumer.
	 * 
	 */

	public static void main(String[] args) {
		 
		Consumer<String> print = (s)->System.out.println("Hello"+s);
		
		print.accept("Viraj");
		
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        Consumer<String> c2 = s -> System.out.println(s.length());
        
        c1.andThen(c2).accept("Viraj");
	}

}
