package basic;

public class Runnable_first {

	public static void main(String[] args) {
		 Thread t1 = new Thread(new Task());
	     Thread t2 = new Thread(new Task());

	        t1.start();
	        t2.start();

	}

}
class Task implements Runnable {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}