package advance;

public class DemonThread_second {

	public static void main(String[] args) throws InterruptedException {
		 
		Thread First = new Thread(()->{
			
			for(int i=0; i<30;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		First.setDaemon(true); // Set Thread as Demon.
		First.start(); // Creating A Thread.
		
		Thread.sleep(3000);
		System.out.println("Main Thread Executed...!");

	}

}
