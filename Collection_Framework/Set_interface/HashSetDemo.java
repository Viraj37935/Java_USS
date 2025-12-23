package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Hash set Not allow duplicate element.
		// No Order Maintain
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set);

	}

}
