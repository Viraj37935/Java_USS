package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excutor_2 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 15; i++) {
			exec.execute(new Thread_1(i));
		}

		exec.shutdown();
	}

}

class Thread_1 extends Thread {

	int id;

	public Thread_1(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "executing the thread..." + this.id);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}