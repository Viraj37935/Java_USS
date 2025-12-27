package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Count_custom {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList( new Employee(1, "A", 45000),
	            new Employee(2, "B", 65000),
	            new Employee(3, "C", 85000),
	            new Employee(4, "D", 35000));

		long count = emp.stream()
				        .filter(e -> e.salary > 50000)
				        .count();
		
		System.out.println("Employees > 50000 salary: "+ count);
	}

}

class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}