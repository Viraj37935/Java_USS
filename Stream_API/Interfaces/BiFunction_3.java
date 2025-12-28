package functional_interface;

import java.util.function.BiFunction;

public class BiFunction_3 {

	public static void main(String[] args) {
		BiFunction<Employee, Double, Double> addBonus = (e, bonus) -> e.salary + bonus;
		
		Employee emp = new Employee("Viraj", 35000);
		 System.out.println("Total Salary = ₹" + addBonus.apply(emp, 5000.0));
	}

}
class Employee {
    String name;
    double salary;

   public  Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}