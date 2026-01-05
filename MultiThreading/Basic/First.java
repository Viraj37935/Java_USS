package basic;

public class First {
	/**
	 * Multithreading is a feature of Java that allows multiple parts of a program (threads) to run concurrently to maximize CPU utilization.
	 * A thread is the smallest unit of execution inside a process.
	 * 
	 * Ways to Create Thread in Java ->
	 * 				(Basic) 1) Extending Thread Class 2) Implementing Runnable Interface. 
	 * 				(Advance) 3) Using Callable interface 4) Using Excutor Framework or ExcutorService.
	 * 
	 * Java Thread Life Cycle -> NEW → RUNNABLE → RUNNING → WAITING → TERMINATED (Dead)
	 */

	
	//Using Thread Class.
	public static void main(String[] args) {
		  MyThread t1 = new MyThread();
	        t1.start(); // creates new thread
	}

}
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}