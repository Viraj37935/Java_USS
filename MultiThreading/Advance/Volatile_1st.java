package advance;

public class Volatile_1st {
	/**
	 * Why volatile ->In multithreading, each thread may keep local copies of variables
	 * 
	 * Without volatile → Visibility Problem
	 * With only volatile → No Atomicity
	 * 					
	 * Volatile -> VOLATILE PROVIDES -> 1. Visibility Guarantee / 2. No Atomicity / 3. Prevents Instruction Reordering
	 * 
	 * With VOLATILE-> Thread A → Main Memory → Thread B
	 */
	
	public static void main(String[] args) throws InterruptedException {
		  VisibilityProblem t = new VisibilityProblem();
	        t.start();

	        Thread.sleep(1000);
	        t.running = false; // change not visible!
	}

}

class  VisibilityProblem extends Thread{
	 boolean running = true; // NOT volatile

	    public void run() {
	        while (running) {
	            // infinite loop
	        }
	        System.out.println("Thread stopped");
	    }
}