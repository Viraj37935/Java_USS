package test;

import java.util.ArrayList;
import java.util.List;

public class Custom_arraylist {

	public static void main(String[] args) {
	 
		List<STD> student = new ArrayList<STD>();
		
		student.addFirst(new STD(101,"Viraj"));
		student.add(new STD (102, "Rahul"));
		student.add(new STD (103,"Amit"));
		
		for(STD s : student) {
			System.out.println("ID of Student: " + s.id);
			System.out.println("Name of Student : " + s.name);
		}
	}

}
class STD {
	int id;
	String name;
	
	public STD(int id, String name) {
		this.id=id;
		this.name=name;
	}
}