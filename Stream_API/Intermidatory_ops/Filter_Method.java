package intermidatory_oprations;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter_Method {

	public static void main(String[] args) {
		
		List<Integer> numbers=new Vector<Integer>();
		
		/**
		 * foreach(Consumer)=>terminal.
		 * filter(Predicate)=> intermediatary.
		 */
		Consumer<Integer>cons=(i)->{System.out.println(i*2.5);}; 
		Predicate<Integer> pred=(i)->{return i>=120;};
		numbers.add(123);
		numbers.add(456);
		numbers.add(789);
		numbers.add(111);
	    numbers.add(120);
		
	    numbers.stream().filter(pred).forEach((i)->{System.out.println(i);});

	}

}
class Greaterthan400  implements Predicate<Integer>
{

	 public boolean test(Integer i)
	 {
		 return i>400;
	 }
}