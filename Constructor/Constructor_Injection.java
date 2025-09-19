package Constructor;

public class Constructor_Injection {

	public static void main(String[] args) {
		
		Axis axis = new Axis ("Viraj");
		
		axis.Displayname();
	}

}


class Axis {
	
	String Name ;
	
	public Axis(String name) {
		
		this.Name=name;
	}
	
	
	public void Displayname() {
		
		System.out.println("The Name is: " + this.Name);
	}
}