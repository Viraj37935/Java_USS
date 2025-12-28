package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Reduce_4 {

	public static void main(String[] args) {
		 
		List<Integer> list = Arrays.asList(10,15,20,25);
		
		int sum = list.stream().reduce(10, (i,j)->(i+j));
		
		System.out.println(sum);
		
		List<Integer> list2 = Arrays.asList(10,15,20,25,89,56);
		
		Integer Sum2= list2.stream().reduce(5, (i,k)->(i*k));
		System.out.println(Sum2);

	}

}
