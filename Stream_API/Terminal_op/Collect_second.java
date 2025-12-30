package terminal_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_second {

	public static void main(String[] args) {
	 
		List<Integer> nums = Arrays.asList(10, 20, 30);

		int sum = nums.stream()
		              .collect(Collectors.summingInt(i -> i));

		double avg = nums.stream()
		                 .collect(Collectors.averagingInt(i -> i));

		System.out.println(sum);
		System.out.println(avg);
		

	}

}
