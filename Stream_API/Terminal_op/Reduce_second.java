package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Reduce_second {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 85, 42, 96, 25,115);

        int max = list.stream()
                      .reduce(Integer::max) // Instance Method Reference
                      .orElseThrow(); // Return Value if Present or Either its throw NoSuchElemenException

        System.out.println("Max = " + max);

	}

}
