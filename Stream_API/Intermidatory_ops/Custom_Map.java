package intermidatory_oprations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Custom_Map {

	public static void main(String[] args) {

		Student viraj=new Student(12,"Viraj");
		Student aditya=new Student(15,"Aditya");
		
		
		Set<Student> set=new HashSet<Student>();
		set.add(viraj);
		set.add(aditya);
		
		Map<String, String> salary=new HashMap<String, String>();
		
		salary.put("Neel", "8800");
		salary.put("Rahul", "8947");
		
		System.out.println(set);
		
		set.stream().map((i)->{return new emp(i.id,i.name,salary.get(i.name));}).forEach((i)->{System.out.println(i);});
	}

}
class Student 
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
		
	}
}
class emp
{
	int id;
	String name;
	String salary;
	
	public emp (int id,String name,String sal)
	{
		this.id=id;
		this.name=name;
		this.salary=sal;
	}
	
	public String toString()
	{
		return this.name+this.id+" "+this.salary;
	}
}
