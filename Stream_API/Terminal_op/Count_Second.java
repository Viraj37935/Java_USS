package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Count_Second {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Arya", "John", "Akash", "Amol", "Peter");
		
		long count = names.stream()
						  .filter(n -> n.startsWith("A"))
						  .count();
		
		System.out.println("Total Names: "+ count);
	}

}
