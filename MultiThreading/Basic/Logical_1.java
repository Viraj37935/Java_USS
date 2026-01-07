package basic;

public class Logical_1 {

	public static void main(String[] args) {
		
		SharedResource resource = new SharedResource();

		WorkerThread1 t1 = new WorkerThread1(resource);
		WorkerThread2 t2 = new WorkerThread2(resource);

		t1.setName("Thread-A");
		t2.setName("Thread-B");

		t1.start();
		t2.start();

	}

}

class SharedResource {

	private int value = 0;

	public void updateValue(String threadName) {

		System.out.println(threadName + " is trying to update value");

		// critical section
		synchronized (this) {
			value++;
			System.out.println(threadName + " updated value to: " + value);

			try {
				Thread.sleep(1000); // simulate delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(threadName + " finished execution");
	}
}

class WorkerThread1 extends Thread {

	SharedResource resource;

	public WorkerThread1(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.updateValue(Thread.currentThread().getName());
	}
}

class WorkerThread2 extends Thread {

	SharedResource resource;

	public WorkerThread2(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.updateValue(Thread.currentThread().getName());
	}
}
