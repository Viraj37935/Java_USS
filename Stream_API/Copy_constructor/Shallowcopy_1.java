package copy_constructor;

public class Shallowcopy_1 {

	public static void main(String[] args) {
		 
		Address a = new Address("Pune");
		
		Employee e1= new Employee (1, a);
		Employee e2= new Employee (e1);
		
		e2.address.city="Mumbai";
		
		//Both objects point to the same Address object
		System.out.println(e1.address.city); // Mumbai
	}

}
class Address {
	String city;

	public Address(String city) {
		
		this.city = city;
	}		
}

class Employee {
	int id;
	Address address;
	
	public Employee (int id, Address address) {
		this.id=id;
		this.address=address;
	}
	
	//Shallo copy constructor
	public Employee(Employee e){
		this.id=e.id;
		this.address=e.address;
	}
}