package method_reference;

import java.util.function.Function;
import java.util.function.Predicate;

public class Arbitory_methodref1 {

	public static void main(String[] args) {
		 
		Predicate<String> checkEmpty = String :: isEmpty;
		
		System.out.println(checkEmpty.test(""));
		System.out.println(checkEmpty.test("Arbitoy Method "));
		
		Function<String, String> fun = String :: toUpperCase;
		
		System.out.println(fun.apply("just conver to upper case "));
		System.out.println(fun.apply("viraj developer "));
		 
	}

}

