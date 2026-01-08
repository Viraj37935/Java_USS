package advance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_exec {

	public static void main(String[] args) {
		 
	try(ExecutorService service = Executors.newFixedThreadPool(2)){
		
		for(int i=0;i<10;i++)
		{
			Demo d=new Demo(i);
			
		Future<String>ft=service.submit(d);
		
		System.out.println(ft.get());
		}

	}
	 catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

}
}
class Demo implements Callable<String>
{
	int id;
	
	public Demo(int id)
	{
		this.id=id;
	}

	@Override
	public String call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+"calling:"+this.id);
		
		Thread.sleep(1000);
		return "demo call"+id;
	}
	
}
