package core;

public class Local_Variable {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.study();

	}

}


class Student 
{
	public void study()
	{
		System.out.println("Students are Studying ");
	}
}

// Local Variable can be declare inside a class inside a method 
// Local Variable Directly print in method 
// We have to create a instance or object to access/call the class 
