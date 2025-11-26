package custom;

public class Five_interface {

	public static void main(String[] args) {
		
		
		Banking deposit = (balance, amt)->{return balance +amt;};
		
		Banking withdraw = (balance, amt)->{
		if(balance>=amt) {
			return balance-amt;
		}else {
			System.out.println("Insufficient Balance! Cannot withdraw " + amt);
			return balance;
		}};
		
		
		double balance = 8000;
		balance = deposit.transaction(balance, 2000);
		System.out.println("After deposit: " + balance);
		
		balance = withdraw.transaction(balance, 2500);
		System.out.println("Total Balance:"+ balance);
		
	}

}
interface Banking {
	double transaction(double balance, double amt);
}