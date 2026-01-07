package basic;

public class Mutal_Syncfirst {
	/**
	 * Only ONE thread at a time is allowed to access a shared (critical) resource.
	 * 
	 * Defination -> Mutual synchronization ensures that when one thread is executing a critical section, no other thread can enter that section until the first thread exits.
	 * 
	 */

	public static void main(String[] args) {
		SharedResource_1 resource = new SharedResource_1();

        Thread1 t1 = new Thread1(resource);
        Thread2 t2 = new Thread2(resource);

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
	}

}

class SharedResource_1 {

    int value = 0;

    void increment(String threadName) {

        System.out.println(threadName + " trying to enter");

        synchronized(this) {   // MUTUAL EXCLUSION
            value++;
            System.out.println(threadName + " updated value to " + value);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

        System.out.println(threadName + " exited");
    }
}
class Thread1 extends Thread {

    SharedResource_1 resource;

    Thread1(SharedResource_1 resource) {
        this.resource = resource;
    }

    public void run() {
        resource.increment(Thread.currentThread().getName());
    }
}
class Thread2 extends Thread {

    SharedResource_1 resource;

    Thread2(SharedResource_1 resource) {
        this.resource = resource;
    }

    public void run() {
        resource.increment(Thread.currentThread().getName());
    }
}

