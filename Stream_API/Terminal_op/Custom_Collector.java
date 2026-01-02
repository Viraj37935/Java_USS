package terminal_operation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Custom_Collector {

	public static void main(String[] args) {
		
		 List<Integer> result =
	                Stream.of(1, 2, 3, 4, 5, 6)
	                      .collect(new EvenSquareCollector());
		 
		 System.out.println(result);
		 
	}

}

class EvenSquareCollector implements Collector<Integer, List<Integer>, List<Integer>> {

	@Override
	public Supplier<List<Integer>> supplier() {
		 
		return () -> new ArrayList<>();
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		 
		return (list, value) -> {
			if(value % 2 == 0) {
				list.add(value * value);
			}
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		 return (list1, list2) -> {
	            list1.addAll(list2);
	            return list1;
	        };
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		return list -> list;
	}

	@Override
	public Set<Characteristics> characteristics() {
		 
		return new HashSet<Collector.Characteristics>();
	}







}