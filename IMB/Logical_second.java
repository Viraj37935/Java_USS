package ibm;

import java.util.Arrays;
import java.util.List;

public class Logical_second {

	public static void main(String[] args) {
		 
		List<Student> list =  Arrays.asList(new Student(15.48,96.55,66.99),new Student(11.65,66.99,87));

		
		list.stream().map(Student::sameClass)
		.map( averagecalculator::showre)
		.forEach(System.out::println);
	}

}

class Student{
	
	double m1;
	double m2;
	double m3;
	double avg;
	
	public Student(double m1,double m2,double m3) {
		
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public double sameClass() {
		
		this.avg=(this.m1+this.m2+this.m3)/3;
		return avg;
	}
}

class averagecalculator
{
	public static double calculate(Student st)
	{
	 double m1=st.m1;
	 double m2=st.m2;
	 double m3=st.m3;
		return (m1+m2+m3)/3;
	}
	
	public static String showre(double d)
	{
		
		if(d>40 && d<100)
		{
			return "Pass";
		}
		else
			return "fail";
	}
}