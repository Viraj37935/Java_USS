package basic;

public class Third {

	public static void main(String[] args) {
		 
		Test t=new Test();
		
		 PrimePrinter prime=new PrimePrinter();
		 
		 t.start();
	     prime.start();
	     
	     // We can also create a Thread using Anonymous inner class.
	     
//	     Thread t2=new Thread() {
//				public void run()
//				{
//					for(int i=0;i<10;i++)
//					{
//						try {
//							Thread.sleep(1500);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						System.out.println(i);
//					}
//				}
//			};
	     
//			t2.start();
	}

}
class Test extends Thread
{

	@Override
	public void run() {
		
		for(int i=0;i<1000;i++)
		{
		
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
		
	}
	
}
class PrimePrinter extends Thread
{
	
	public void run()
	{
	
		for(int i=2;i<100;i++)
		{
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 boolean flag=false;
			 for(int j=2;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 flag=true;
				 }
			 }
			 
			 if(!flag)
			 {
				 System.out.println("Prime:"+i);
			 }
		}
	}
}