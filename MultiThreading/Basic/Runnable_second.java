package basic;

public class Runnable_second {

	public static void main(String[] args) throws InterruptedException {

		//Creating Thread using Runnable Lambda Expression.
		Runnable r = () -> {

			for (int i = 0; i < 15; i++) {
				System.out.println("--!--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread th = new Thread(r);

		th.start();
		th.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
			Thread.sleep(1000);
		}

	}

}
