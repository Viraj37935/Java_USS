package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Count_methodops {
	/**
	 * Count() is return the Size of Stream.
	 */

	public static void main(String[] args) {
		 
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		
		long count = list.stream().count();
		System.out.println("Total Elements:" + count);

	}

}
