package core;

public class Variables_One {

	public static void main(String[] args) {
		
		Vehical bmw = new Vehical (); // Creating Instance of Class Vehicle 
		
		bmw.start(); // call method using instance. // Instance Method Directly Print Value its own 
		
		// Printing instance variable (default value)
		System.out.println("Instance Variable (price) default value: " + bmw.price);  // call instance Variable 
		
		
		System.out.println("Static Variable (car) " +  Vehical.car); // We directly Call Static Variable without creating instance using Class.
	}

}


class Vehical
{	
	static String car = "Lambo"; // Static VAriable 
	double price; // Instance variable (Default Value)
	
	public void start()
	{
		String name;
		
		name = "Mustang"; // Local Variable 
		System.out.println("Car is Starting...."); 
		System.out.println(name);
	}
}