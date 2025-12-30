package terminal_operation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect_1 {
	
	/**
	 * collect() -> 
	 * 				Converts Stream → Result
	 * 				It is a terminal operation (ends stream processing)
	 */				

	public static void main(String[] args) {
		 
		List<String> list = Stream.of("A", "B", "C")
							      .collect(Collectors.toList());
		
		System.out.println(list);
	}

}
