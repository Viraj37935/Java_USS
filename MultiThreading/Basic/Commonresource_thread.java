package basic;

public class Commonresource_thread {
	/**
	 * A common (shared) resource is any object/data accessed by multiple threads at
	 * the same time.
	 * 
	 * Race Condition -> When multiple threads modify the same resource
	 * simultaneously, the result becomes incorrect or unpredictable.
	 * 
	 */

	// Without Syncronization
	public static void main(String[] args) throws InterruptedException {
		
		Resource res = new Resource();

		IncreamentThread thread1 = new IncreamentThread(res);
		Demo thread2 = new Demo(res);

		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(res.getCounter());

	}

}

class Resource {
	int counter = 1;

	public int getCounter() {
		return this.counter;
		
	}
}

class IncreamentThread extends Thread {
	Resource res;

	public IncreamentThread(Resource res) {
		this.res = res;
	}

	public void run() {
		int sum = 1;
		while (sum < 1500) {
			this.res.counter++;
			sum++;
		}
		System.out.println("total counter:" + this.res.counter);
	}
}

class Demo extends Thread {
	Resource res;
	
	public Demo (Resource res) {
		this.res=res;
	}
	
	public void run() {
		int sum = 1;
		while (sum < 1500) {
			this.res.counter++;
			sum++;
		}
		System.out.println("total counter:" + this.res.counter);
	}
}