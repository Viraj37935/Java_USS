package core;

public class Static_Variable {

	public static void main(String[] args) {
		
		// Don't have to create instance or object.
		// we can directly call the name which have static keyword with variable or method 
		System.out.println(Beach.name); 
		
	}

}

class Beach 
{
	static String name = "Goa";
}

