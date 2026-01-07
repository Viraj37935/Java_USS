package basic;

public class Mutual_wait_notify {

	public static void main(String[] args) {

		Common common = new Common();

		Producer p = new Producer(common);
		Consumer c = new Consumer(common);

		p.start();
		c.start();
	}

}

class Common {

	int data;
	boolean display = false;

	public synchronized void produce(int value) throws InterruptedException {
		while (display) {
			wait();
		}
		this.data = value;
		System.out.println("Produce: " + data);
		display = true;

		notify(); // Wake another thread
	}

	public synchronized int consume() throws InterruptedException {

		while (!display) {
			wait(); // wait until data available
		}

		System.out.println("Consumed: " + data);
		display = false;

		notify(); // wake another thread
		return this.data;
	}
}

class Producer extends Thread {

	Common common;

	Producer(Common common) {
		this.common = common;
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				common.produce(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

class Consumer extends Thread {

	Common common;

	Consumer(Common common) {
		this.common = common;
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				common.consume();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}
}
