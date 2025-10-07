package Abstraction;

public class Anonymous_Class {

	public static void main(String[] args) {
		
		City city=new City() {
			public void pincode(String pin) {
				System.out.println(pin);
			}
		};
		city.pincode("411030");

	}

}

abstract class City{
	
	abstract public void pincode(String pin);
}