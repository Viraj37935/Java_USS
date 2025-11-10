package CustomException;

import java.util.Scanner;

public class CustoomException3 {

	public static void main(String[] args) {
		
	
		try{
			UPI_Pin.payment();
		}
		catch(InvalidPinException ex) {
			System.out.println(ex.getMessage());
		}
	
	}

}

class UPI_Pin {
	
	public static void payment () throws InvalidPinException{

		final String pin = "112255"; 
		String pass = "112255" ;
		
		if(!pass.equals(pin)) {
			throw new InvalidPinException("Pin Is wrong", 200);
		}
		System.out.println("Initiating Pyment");
		
	}
}

class InvalidPinException  extends Exception {
	

	int code;
	
	public InvalidPinException (String msg , int code ) {
		
		super(msg);
		this.code=code;
	}
	
	public int getCode( ) {
		
		return this.code=code;
	}
}