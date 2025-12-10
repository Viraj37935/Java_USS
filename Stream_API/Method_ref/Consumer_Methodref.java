package method_reference;

import java.util.function.Consumer;

public class Consumer_Methodref {

	public static void main(String[] args) {
		 
		Consumer<String> c = Simple::show;
		c.accept("Hello form Static Method");
		
		Simple obj = new Simple();
		Consumer<String> c2 = obj::print;
		
		c.accept("Calling from Instance ");

	}

}

class Simple {
	
	public static void show(String msg)
	{
		System.out.println(msg);
	}
	
	public void print(String t)
	{
		System.out.println(t);
	}
}