package list_interface;

import java.util.List;
import java.util.Vector;

public class Vector_First {

	public static void main(String[] args) {

		List<Integer> list=new Vector<Integer>();
		
		list.add(58);
		list.add(78);
		list.add(88);
		list.add(25);
		list.add(63);
		list.add(14);
		list.add(22);
		
		System.out.println(list);
		
		System.out.println(list.get(4));
		System.out.println(list.remove(6));// remove element with index.
		list.clear(); // Clear the All elements from list.
		
		System.out.println(list);
		 
	}

}
