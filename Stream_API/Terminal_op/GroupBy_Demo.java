package terminal_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy_Demo {

	public static void main(String[] args) {

		List<Emp> list = Arrays.asList(new Emp("Amit", "IT"), new Emp("Sara", "HR"), new Emp("Raj", "IT"));
		
		Map<String, List<Emp>> result = list.stream().collect(Collectors.groupingBy(e -> e.dept));
		
	     System.out.println(result);
	}

}

class Emp {
	String dept;
	String name;

	public Emp(String dept, String name) {

		this.dept = dept;
		this.name = name;
	}
	
	public String toString () {
		
		return this.name + " " + this.dept;
	}
}