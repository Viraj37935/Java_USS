package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Arbitory_methodref3 {

	public static void main(String[] args) {
	 
		List<Emp> employee = Arrays.asList(new Emp("Viraj"),new Emp("Soham"),new Emp("Sagar"), new Emp("Rohit"));
			
			Consumer<Emp> printEmp = Emp::printName; // Arbitrary Method Reference	
			
			employee.forEach(printEmp);
	}
}

class Emp {
	
	String name;
	
	public Emp(String name)
	{
		this.name=name;
	}
	
	public void printName()
	{
		System.out.println("Employee Name: " + name);
	}
}