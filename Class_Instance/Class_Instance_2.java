package core;

public class Class_Instance_2 {

	public static void main(String[] args) {
		
		// To Call Sub-Class creating Instance/Object 
		
		Plan airindia = new Plan ();
		
		airindia.fly();
	}

}


class Plan // sub class 
{
	public void fly() // sub class Method 
	{
		System.out.println("Aeroplan is ready to tack off ");
	}
}
