package functional_interface;

import java.util.Arrays;
import java.util.List;

public class Binary_4 {

	public static void main(String[] args) {
		 
		List<Integer> list = Arrays.asList(5, 10, 15, 20);
		
		int sum = list.stream()
                      .reduce(0, Integer::sum); // reduce method take Binary oprator to work with.

		System.out.println("Total = " + sum);
	}

}
