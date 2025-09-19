package Constructor;

public class Constructor_second {

	public static void main(String[] args) {
		
		Flipcart O = new Flipcart(1500,"Anmol Sharma", "Mumbai", "9874587935");
		
		O.Deliver();
		System.out.println(O.price);
		System.out.println(O.C_name);
		System.out.println(O.C_ADD);
		System.out.println(O.C_Mobile);

	}

}

class Flipcart{
	
	int price;
	String C_name;
	String C_ADD;
	String C_Mobile;
	
	// Non-PRAM Constructor
	public Flipcart () {
		
		System.out.println("Object Created.......");
	}
	
	// PARM Constructor
	public Flipcart(int num, String Name, String city, String number){
		this.price=num;
		this.C_name=Name;
		this.C_ADD=city;
		this.C_Mobile=number;
		
	}
	
	public void Deliver() {
		
		System.out.println("Order Deliverd to: "+ this.C_name);
	}
}
