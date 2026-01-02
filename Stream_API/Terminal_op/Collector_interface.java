package terminal_operation;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class Collector_interface {

	public static void main(String[] args) {
		 
		Collector<String, StringBuilder, String> custom = 
				 Collector.of(
	                        () -> new StringBuilder(),                // supplier
	                        (sb, s) -> sb.append(s.toUpperCase()).append(","), // accumulator
	                        (sb1, sb2) -> sb1.append(sb2),           // combiner
	                        sb -> sb.substring(0, sb.length() - 1)   // finisher
	                );
		String result = Stream.of("java","optional","collector")
							   .collect(custom);
		
		System.out.println(result);
	}

}
