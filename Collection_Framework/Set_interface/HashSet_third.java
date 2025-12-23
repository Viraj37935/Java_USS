package set_interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet_third {
	/*
	 * in HashSet, elements add on basis of HashCode, if HashCode is diff. then elem. is added in HashSet
	 * 
	 * in custom class -
	 * by default, HashCode and equal will never be true
	 * in custom class HashCode is generated on basis of memory reference. (even 2 object. are different. but have same value, it still give diff hashcode)
	 * so we need to override both methods in custom classes.
	 * 
	 * there are 2 cases (if HashCode is same) - 
	 * 
	 * it will check .equals()-
	 *   - if .equals() is true it will not add that element
	 *   - if .equals() is false, it will add element at same Hashbucket (hash collision happens)
	 *   
	 * ifHashCode() is different. it will not check the .equals() directly add element
	 * 
	 * 
	 * 
	 * 
	 * */


	public static void main(String[] args) {
		Student_A s = new Student_A(1, "vinayak");
		Student_A s2 = new Student_A(1, "vinayak");
		Student_A s3 = new Student_A(1, "vinayak");
		
		Set<Student_A> set = new HashSet<Student_A>();
		
	
		
		set.add(s);
		set.add(s2);
		set.add(s3);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s.equals(s2));
		
		System.out.println(set);

	}

}
class Student_A{
	int id;
	String name;
	
	Student_A(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return "id = " + this.id;
	}
	
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Student_A))
			return false;
		
		Student_A s1 = (Student_A)obj;
		
		return this.id == s1.id && this.name.equals(s1.name);
	}
	
}
