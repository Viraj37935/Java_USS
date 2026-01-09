package advance;

public class Volatile_2nd {

	public static void main(String[] args) throws InterruptedException {
		VolatileFix t = new VolatileFix();
		t.start();

		Thread.sleep(1000);
		t.running = false; // visible immediately

	}

}

class VolatileFix extends Thread {

	volatile boolean running = true;

	public void run() {
		while (running) {
		}
		System.out.println("Thread stopped safely");
	}
}