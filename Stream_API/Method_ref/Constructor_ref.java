package method_reference;

import java.util.Arrays;
import java.util.List;

public class Constructor_ref {

	public static void main(String[] args) { 

		List<String> list = Arrays.asList("A", "Z", "C", "X");
		
		list.stream().filter(Check_Aski::check)
		             .map(StringBuilder :: new)
		             .map(StringBuilder::reverse)
		             .map(StringBuilder::toString)
		             .forEach(System.out::println);
	}

}

class Check_Aski {
	
	public static boolean check(String str) {
		
		return str.charAt(0) > 80;
	}
}