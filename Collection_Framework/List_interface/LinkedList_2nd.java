package list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_2nd {

	public static void main(String[] args) {


		List<Integer> list = new LinkedList<Integer>();

		    list.add(5);
	        list.add(15);
	        list.add(25);
	        
	        System.out.println(list.contains(15));
	        
	        System.out.println(list.contains(100));
	}

}
