package CustomException;

public class CustomException2 {

	public static void main(String[] args) {
		
		UPI cash = new UPI();
		
		cash.withdraw();
		
	}

}

class UPI {
	
	final int Balance = 10000;
	
	int Amt = 10598 ;
	
	public void withdraw () {
		try {
		if(Amt> Balance) {
			throw new InsufficientBalanceException("Balance Is Low ", 100);
		}
		System.out.println("Checking Balance!");
		System.out.println("Amt withdraw Sucessfully");
		
		}
		catch(InsufficientBalanceException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCode());
		}
	}
}


class InsufficientBalanceException extends Exception {
	
	int code;
	
	public InsufficientBalanceException (String msg , int code ) {
		
		super(msg);
		this.code=code;
	}
	
	public int getCode( ) {
		
		return this.code=code;
	}
}