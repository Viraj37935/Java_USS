package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executive_frame1 {
	/**
	 * Executor Framework - > The Executor Framework separates task submission from
	 * task execution, so developers don’t have to manage threads manually. (Its
	 * ANother Interface).
	 * 
	 * Executive Service -> Its used for handel Thread Creations, Thread Termination
	 * (Avoid Trashing).
	 * 
	 * 
	 * ThreadPool -> For Create Thread Pool -> newFixedThreadPool() (We Declare how
	 * Many threads we have to cretae ) , newSingleThreadExecutor() (Create only 1
	 * thread), newCachedThreadPool()
	 */

	public static void main(String[] args) {

		ExecutorService ser = Executors.newFixedThreadPool(2);

		for (int i = 1; i <= 100; i++) {
			ThreadDemo demo = new ThreadDemo(i);

			ser.execute(demo);
		}
		ser.shutdown(); // Once we Create Thread Pool We have Manually Shut it down (else Its Go
						// infinite / leaks Memory).
	}

}

class ThreadDemo extends Thread {

	int id;

	public ThreadDemo(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "Executing From Run Method: " + this.id);

		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}