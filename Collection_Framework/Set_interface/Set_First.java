package set_interface;

import java.util.HashSet;
import java.util.Set;

public class Set_First {
	/*
	 * Set - cannot contain duplicate element
	 * 
	 * HashSet - 
	 * - insertion order is not maintained
	 * - no duplicates are allowed in hashSet
	 * - only  1 null values are allowed
	 * - initial cap. is 16 and load factor is 0.75
	 * - hashSet is used to maintain uniqueness
	 * - it add elements on the basis of hashCode (if hashcode is diff. then it will only add)
	 * 
	 * Internal Working - 
	 * - 1st it will check hashcode and then equalness by .equals()
	 * - if hashcode is same then it will check .equals()
	 * - if hashcode is diff. then it will not check .equals() directly add element
	 * */


	public static void main(String[] args) {
		
		/**
		 * SET=> HashSet, LinkedHashSet, TreeSet
		 */
		
		
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
