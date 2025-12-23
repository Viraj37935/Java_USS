package list_interface;

import java.util.ArrayList;
import java.util.List;

public class Array_list_1st {
	
	/*
	 * ArrayList - 
	 * - internally use dynamic array
	 * - it maintain insertion order
	 * - useful for random access of element(due to index based) has O(1) constant time complexity
	 * - not useful for insertion and deletion of element. because internal shifting of indices - O(1) linear time complexity
	 * - initial cap. is 10
	 * - allow duplicates and multiple null values
	 * */


	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<Integer>();
		
		
		obj.add(15);
		obj.add(25);
		obj.add(10);
		obj.add(49);
		obj.add(96);
		obj.add(null);
		obj.add(null);
		
		System.out.println(obj);
		System.out.println(obj.size());
	}

}
