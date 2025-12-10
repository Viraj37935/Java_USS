package method_reference;

import java.util.function.Function;

public class Function_Method_ref {

	public static void main(String[] args) {
		
		Function<String, Integer> fun = test2::stringconvert;
		System.out.println(fun.apply("8547"));
		
		test2 obj = new test2();
		
		Function<String, Integer> fun2=obj::size;
		System.out.println(fun2.apply("Viraj Developer"));
	}

}

class test2{
	
	public static Integer stringconvert(String str)
	{
		return Integer.parseInt(str);
	}
	
	public int size(String str)
	{
		return str.length();
	}
}