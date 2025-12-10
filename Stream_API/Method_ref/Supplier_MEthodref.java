package method_reference;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Supplier_MEthodref {

	public static void main(String[] args) {

		Supplier<String> str=practice::msg;
		System.out.println(str.get());

		practice obj1=new practice();
		
		Supplier<LocalDateTime> time=obj1::current;
		System.out.println(time.get());
	}

}

class practice {
	
	public static String msg()
	{
		return "Message from Supplier...!";
	}
	
	public LocalDateTime current()
	{
		return LocalDateTime.now();
	}
}