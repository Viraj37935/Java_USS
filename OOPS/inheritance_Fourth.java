package Inheritance;

public class inheritance_Fourth {

	public static void main(String[] args) {

		Indigo i=new Indigo();
		i.Life();
	}

}
/**
 * Super Call Jumping from Child to Parent 
 * 
 * but always remember indirectly First object is created by Parent that is super call  
 */
class Human_1 {
	
	public Human_1() {
		
		System.out.println("Constructor of Human");
	}
	
	public void Life() {
		
	}
}

class Aeroplane extends Human_1 {
	
	public Aeroplane () {
		
		System.out.println("A");
	}
	
	public Aeroplane (int i) {
		
		this();
		System.out.println("B");
	}
}

class Indigo extends Aeroplane {
	
	public Indigo() {
		
		super(50);
		System.out.println("C");
	}
}