package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Static_Method_ref {

	public static void main(String[] args) {
		
		Predicate<Integer> p=Test1::iseven;
		System.out.println(p.test(62));
		
		List<String> list=Arrays.asList("ABC","Amit","Arjun","Rohit","Raj");
		
		Test1 t = new Test1();
		Predicate<String> p2 =t::startWith;
		
		list.stream()
		.filter(p2)
		.forEach(System.out::println);
		
	}

}
class Test1{
	
	public static boolean iseven(Integer n)
	{
		return n % 2 == 0;
	}
	
	public boolean startWith(String name)
	{
		return name.startsWith("A");
	}
}