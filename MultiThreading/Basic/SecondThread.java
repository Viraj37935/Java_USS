package basic;

public class SecondThread {

	public static void main(String[] args) throws InterruptedException {
		boolean status=true;
		
		Number_Print num1=new Number_Print();
		
		Number_Print num2=new Number_Print();
		Number_Print num3=new Number_Print();
		
		num1.start();
		num2.start();
		num3.start();
		
		while(status)
		{
			Thread.sleep(1000);
			System.out.println("*");
		}
		
	}

}

class Number_Print extends Thread {
	
	// Implement Runnable Method.
	public void run() {
		for(char i='A';i<'Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}