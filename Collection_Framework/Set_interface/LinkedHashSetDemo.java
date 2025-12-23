package set_interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		/**
		 * LinkedHashSet Maintain Insertion order.
		 * not allow duplicate element
		 */
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("A");
		
		System.out.println(set);
	}

}
 