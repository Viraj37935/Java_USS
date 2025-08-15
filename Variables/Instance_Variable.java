package core;

public class Instance_Variable {

	public static void main(String[] args) {
		
		Country city = new Country (); 
		
		city.india();
		city.germany();
		
		System.out.println(city.Fname);
		System.out.println(city.Fname2);
		
	}

}

class Country 
{
	String Fname = "Indigo"; // Instance Variable One
	String Fname2 = "Emirates"; // Instance Variable Two
	
	public void india()
	{
		System.out.println("Welcome to India ");
		System.out.println(Fname); // Accessing Instance variable in Class 
	}
	
	public void germany()
	{
		System.out.println("Welcome to Germany ");
		System.out.println(Fname2); // Accessing Instance Variable in class 
	} 
}

// Instance Variable declare inside a class but outside the method.
// We Directly access the instance variable in Method.
// have to create a instance or object 
