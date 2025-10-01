package Inheritance;

public class Inheritance_third {

	public static void main(String[] args) {
		
		demo d = new demo (450, 890);
		// 123
	}

}

class demo {
	
	int id;
	
	public demo() {
		
		this.id=120;
		System.out.println("One");
		
	}
	
	public demo(int i) {
		
		//this(100,2000);
		this();
		System.out.println("Two");
	}
	
	public demo(int j, int f) {
		
		this(750);
		System.out.println("Three");
	}
}