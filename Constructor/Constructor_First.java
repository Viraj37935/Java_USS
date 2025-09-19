package Constructor;

public class Constructor_First {

	public static void main(String[] args) {
		
		Animal obj = new Animal("Tiger");
		
		System.out.println(obj.A_Name);
		obj.DisplayName();

	}

}

class Animal{
	
	String A_Name ;
	
	public Animal(String name) {
		
		this.A_Name=name;
	}
	
	public void DisplayName() {
		
		System.out.println("The Name of Animal is: " + this.A_Name);
	}
}
