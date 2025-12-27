package method_reference;

import java.util.Arrays;
import java.util.List;


public class Logical_34 {

	public static void main(String[] args) {
		
		List<Student_2> std = Arrays.asList(new Student_2(75,85,63),new Student_2(85,45,53));
		
		std.stream().map(Student_2::Total).forEach(System.out::println);
	}

}

class Student_2{
	
	  int Marks1, Marks2, Marks3;
	
	public Student_2(int Marks1, int Marks2, int Marks3) {
		
		this.Marks1=Marks1;
		this.Marks2=Marks2;
		this.Marks3=Marks3;
	}
	
	public int Total() {
		int Total = Marks1+Marks2+Marks3;
		return Total;
	}
}