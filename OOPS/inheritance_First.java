package Inheritance;

public class inheritance_First {

	public static void main(String[] args) {
		
		Viraj viraj = new Viraj ();
		
		viraj.city();
		viraj.walk();
		
		viraj.run();
	}

}

// Parent Class 
class Human {
	
	public void walk() {
		
		System.out.println("Walking ");
	}
	
	public void run() {
		
		System.out.println("Runing....");
	}
	
	
}


/**
 * IS-A Relation 
 */

// Child Class
class Viraj extends Human {
	
	
	public void city() {
		
		System.out.println("PUNE");
	}
}