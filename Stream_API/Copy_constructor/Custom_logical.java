package copy_constructor;

public class Custom_logical {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(123456, 5000);
        BankAccount b2 = new BankAccount(b1);

        b2.balance += 2000;

        System.out.println(b1.balance); // 5000
        System.out.println(b2.balance); // 7000

	}

}
class BankAccount {
    long accNo;
    double balance;

  public  BankAccount(long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Copy Constructor
  public  BankAccount(BankAccount b) {
        this.accNo = b.accNo;
        this.balance = b.balance;
    }
}
