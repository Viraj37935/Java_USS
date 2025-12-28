package functional_interface;

import java.util.function.BinaryOperator;

public class Binaray_operator_interface {
	/**
	 * BinaryOperator is used when both arguments and return type are the same.
	 * It is a specialized version of the BiFunction<T, T, T>.
	 * 
	 * When we use BinaryOperator? :- 
	 * Whenever we want to combine, compare, or reduce two values 
	 * Ex- Sum of two integers,String concatenation
	 */

	public static void main(String[] args) {
		 
		BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println("Addition = " + add.apply(10, 20));
        
        BinaryOperator<String> concat = (s1, s2) -> s1 + " " + s2;

        System.out.println(concat.apply("Hello", "World"));

	}

}
