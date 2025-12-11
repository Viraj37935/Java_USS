package intermidatory_oprations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Limit_Skip1 {

	public static void main(String[] args) {
		List<Emp> uss=new ArrayList<Emp>();
		uss.add(new Emp("IT",34567.76));
		uss.add(new Emp("HR",1212.12));
		uss.add(new Emp("IT",55555.67));
		uss.add(new Emp("HR",3333.333));

		System.out.println("IT");
		uss.stream()
		.filter((e) -> (e.dept.equals("IT")))
		.sorted(new EmpSalary())
		.limit(2)
		.skip(1)
		.forEach((i)->{ System.out.println(i);});
		
		
		 
			
	}

}
class Emp
{
	
	String dept;
	double salary;
	public Emp(String dept, double salary)
	{
		this.dept=dept;
		this.salary=salary;
	}
	
	public int hashCode()
	
	{
		return Objects.hash(this.dept);
	}
	
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		return this.dept.equals(e.dept);
	}
	
	
	
	public String toString() {
		return  dept+salary;
	}
	
}

class EmpSalary implements Comparator<Emp>
{

	
	public int compare(Emp o1, Emp o2) {
		
		return Double.compare(o2.salary,o1.salary);
	}
	
}