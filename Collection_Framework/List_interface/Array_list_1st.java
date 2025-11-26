package list_interface;

import java.util.ArrayList;
import java.util.List;

public class Array_list_1st {

	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<Integer>();
		
		
		/**
		 * ArrayList=> re-sizeable array.
		 */
		
		
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
