package functional_interface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Binaray_custom {

	public static void main(String[] args) {
		Employee_2 e1 = new Employee_2("AAA", 45000);
		Employee_2 e2 = new Employee_2("BBB", 55000);
		
		BinaryOperator<Employee_2> highestSalary =
                BinaryOperator.maxBy(Comparator.comparingDouble(e -> e.salary));
		
		 Employee_2 result = highestSalary.apply(e1, e2);
	        System.out.println("HIGHEST: " + result.name + " => " + result.salary);
	}

}
class Employee_2 {
    String name;
    double salary;
   public Employee_2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}