package functiion;

import java.util.function.Function;

public class custom {

	public static void main(String[] args) {
		
		Function<Student, Employee> after=(i)->{
			Employee e1=new Employee();
			e1.empname=i.stdname;
			return e1;
		};
		
		Function<Manager, Student> before=(j)->{
			Student s1=new Student();
			s1.stdname=j.Mgname;
			return s1;
		};
		
		Function<Manager, Employee> composite =after.compose(before);
		
		Manager mg=new Manager();
		mg.Mgname="Viraj";
		
		System.out.println(composite.apply(mg));
	}

}

class Student{
	String stdname;
	
	public String toString() {
		return "student Name:"+this.stdname;
	}
}

class Employee {
	String empname;
	
	public String toString()
	{
		return "Employee Name:"+this.empname;
	}
}

class Manager{
	String Mgname;
	
	public String toString() 
	{
		return "Manger Name:"+this.Mgname;
	}
}