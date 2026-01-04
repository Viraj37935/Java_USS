package copy_constructor;

public class Deepcopy_1 {

	public static void main(String[] args) {
		 Add a = new Add("Pune");
	        Emp e1 = new Emp(1, a);
	        Emp e2 = new Emp(e1);

	        e2.address.city = "Mumbai";

	        System.out.println(e1.address.city); // Pune ✅
	}

}

class Add {
	String city;

	public Add(String city) {
		this.city = city;
	}

	// Copy constructor
	public Add(Add a) {
		this.city = a.city;
	}
}

class Emp {
	int id;
	Add address;

	public Emp(int id, Add address) {
		this.id = id;
		this.address = address;
	}
	
	 // Deep Copy Constructor
	public Emp(Emp  e) {
		this.id=e.id;
		this.address=new Add(e.address);
	}

}