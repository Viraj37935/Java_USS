package Polymorphism;

public class Compile_Time {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.add(15, 15, 20.48);
		System.out.println(calc.add(78.20,25.460));
	}

}
class MAths_operations {
	
	public int add (int a, int b) {
		
		return a + b;
	}
	
	
	public double add(double a, double b) {
		
		return a * b;
	}
}
class Calculator extends MAths_operations {
	
	/*
	 * Method Overload with 3 PARAMS 
	 */
	public int add (int a , int b, double c) {
		
	System.out.println(a+b*c);
	return b;	
	
	}
	
	public double add (double  a, double  b) {
		System.out.println(a/b);
		return a;
	}
}