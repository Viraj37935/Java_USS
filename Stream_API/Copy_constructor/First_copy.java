package copy_constructor;

public class First_copy {
	/**
	 * A Copy Constructor is a special constructor that creates a new object by
	 * copying the values of another object of the same class.
	 * 
	 * Why Copy Constructor is Needed? ->
	 * 
	 * Objects may share references. Changes in one object can affect another.
	 * Shallow copy problems occur.
	 * 
	 * Syntax -> ClassName(ClassName ref) { // copy logic }
	 */

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Viraj");
		Student s2 = new Student(s1);
		
		// Here s2 obj get values of s1, but both object are separate.
		System.out.println(s2.id); // 101
		System.out.println(s2.name); // Viraj
	}

}
class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	//Copy constructor
	public Student(Student s) {
		this.id=s.id;
		this.name=s.name;
	}
}