package set_interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet_second {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(5);
		set.add(1);

		set.add(3);
		set.add(3);
		set.add(8);
		set.add(2);
		set.add(null);
		set.add(null);

	//	System.out.println(set);

		Set<String> set1 = new HashSet<String>();

		set1.add("Viarj");
		set1.add("akash");
		set1.add("Viraj");
		set1.add("shubham");
		
	//	System.out.println(set1);

		Student s1 = new Student(1, "Viraj");
		Student s2 = new Student(1, "Viraj");
	
		Set<Student> st = new HashSet<Student>();
		st.add(s1);
		st.add(s2);
		System.out.println(st);
	}

}

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "id :" + this.id +" "+  "Name :" + this.name;
	}

	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || !(obj instanceof Student))
			return false;

		Student std = (Student) obj;

		return this.id == std.id && this.name.equals(std.name);
	}

}