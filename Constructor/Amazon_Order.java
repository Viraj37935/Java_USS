package Constructor;

public class Amazon_Order {

	public static void main(String[] args) {
		
		Amazon shop = new Amazon("Viraj", "Pune", "9874583255", 145.89); // Minimum Requirement CI.
		
		Amazon shop2 = new Amazon("Rohit", "7894586258", "Mumbai", "4111035",2158.35, "9874-8974-9854" ); // All Requirement CI.
		
		Amazon shop3 = new Amazon(); // Default Constructor.
		
		shop.deliver();
		shop2.deliver();
		shop3.deliver();
		
		shop.showdetails();
		shop2.showdetails();
		shop3.showdetails();
	}
}

class Amazon
{
	 String name;
	    String mobile;
	    String city;
	    String pincode;
	    double price;
	    String aadhar;
	    String pan;
	
	 // Default Constructor
	public Amazon() {
		
		 this.name = "Unknown";
	     this.mobile = "N/A";
	     this.city = "N/A";
	     this.pincode = "000000";
	}
	
	/**
	 * Constructor Injection With Minimum PARAM(Requirement).
	 * @param name
	 * @param city
	 * @param mobile
	 * @param price
	 */
	public Amazon(String name , String city, String mobile, double price) {
		
		this.name=name;
		this.city=city;
		this.mobile=mobile;
		this.price=price;
	}
	
	/**
	 * CI => with all requirements. 
	 * @param Name
	 * @param Mobile
	 * @param City
	 * @param Code
	 * @param Price
	 * @param Aadhar
	 */
	public Amazon(String Name, String Mobile, String City, String Code, double Price, String Aadhar) {
		this.name=Name;
		this.mobile=Mobile;
		this.city=City;
		this.pincode=Code;
		this.price=Price;
		this.aadhar=Aadhar;
	}
	
	
	public void deliver() {
		
		System.out.println("Order delivered to : " + this.name + " (" + this.city + ")");
	}
	
	public void showdetails() {
		
		System.out.println("*************************");
		System.out.println(this.name + " | " + this.mobile + " | " + this.city + " | " + this.pincode);
	}
	
}