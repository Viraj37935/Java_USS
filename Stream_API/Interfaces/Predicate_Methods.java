package functional_interface;

import java.util.function.Predicate;

public class Predicate_Methods {
	/**
	 * Default Methods -> 
	 * 
	 * and(Predicate after) -> Both conditions must be true (Logical AND)
	 * or()  -> Either condition must be true (Logical OR)
	 * negate() -> Reverse result (Logical NOT)
	 */

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (n)->(n % 2 == 0);
		
		System.out.println(isEven.test(15)); // False
		System.out.println(isEven.test(46)); // True

		
		 Predicate<Integer> isPositive = n -> n > 0;
		 
		 System.out.println(isPositive.and(isEven).test(3));
		 
		 System.out.println(isEven.or(isPositive).test(-4));
		 
		 System.out.println(isEven.negate().test(6));
	}

}
