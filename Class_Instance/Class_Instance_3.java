package core;

public class Class_Instance_3 {

	public static void main(String[] args) {
		
		Vehicle swift = new Vehicle(); // we creating object to see inside the Vehicle class
		
		swift.driving(); // to call class method 
		swift.stop(); // to call class method 
		
		System.out.println(swift.price); // We Don't want  to create  instance to call instance Variable 
		
	}

}

// Creating  Sub-Class
class Vehicle

{
	double price=34334.67; // This is Instance Variable
	
	public void driving() // Sub-Class Method  
	{
		
		System.out.println("car is running....");
		System.out.println(price); 
	}
	
	public void stop() // Sub-Class Method 
	{
		System.out.println("car has stopped....");
		System.out.println(price);
	}
}


