package set_interface;

import java.util.HashSet;
import java.util.Set;

public class Set_First {

	public static void main(String[] args) {
		
		/**
		 * SET=> HashSet, LinkedHashSet, TreeSet
		 */
		
		// HashSet Does not Maintain Insertion Order.
		// Initial Capacity 16, Default Load factor 0.75
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(56);
		set.add(89);
		set.add(12);
		set.add(66);
		set.add(74);
		set.add(53);
		set.add(21);
		set.add(10);
		set.add(33);
		
		System.out.println(set);
		
	}

}
