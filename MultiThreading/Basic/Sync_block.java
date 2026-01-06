package basic;

public class Sync_block {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

		Thread t1 = new Thread(() -> acc.withdraw(7000), "User-1");
		Thread t2 = new Thread(() -> acc.withdraw(7000), "User-2");

		t1.start();
		t2.start();
	}

}

class BankAccount {
	private int balance = 10000;

	public void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " trying to withdraw");

		synchronized (this) {
			if (balance >= amount) {
				balance -= amount;
				System.out
						.println(Thread.currentThread().getName() + " withdrawn " + amount + " | Balance: " + balance);
			} else {
				System.out.println("Insufficient balance for " + Thread.currentThread().getName());
			}
		}
	}
}