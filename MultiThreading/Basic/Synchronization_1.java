package basic;

public class Synchronization_1 {

	public static void main(String[] args) throws InterruptedException {
		Prime p1=new Prime();
		
		Thread_one t1=new Thread_one(p1,"one");
		Thread_second t2=new Thread_second(p1,"two");
		
		t2.setPriority(1);
		t1.setPriority(10);
		
		t1.start();
		t2.start();
		
		
		Thread.sleep(1500);
		System.out.println(p1.counter);
	}

}

class Prime {

	int counter = 2;

	//Synchronized Method -> Only one thread at a time can access increase()
	public synchronized void increase() {
		counter++;
	}
}

class Thread_one extends Thread {

	Prime p;

	public Thread_one(Prime p, String s) {
		super(s);
		this.p = p;
	}

	public void run() {
		int counter = 1;

		System.out.println(this.getName() + "working");
		while (counter < 10000) {
			p.increase();
			counter++;
		}
	}
}

class Thread_second extends Thread {

	Prime p;

	public Thread_second(Prime p, String s) {
		super(s);
		this.p = p;
	}

	public void run() {
		System.out.println(this.getName() + "working....");
		int counter = 1;

		while (counter < 10000) {
			p.increase();
			counter++;
		}
	}
}