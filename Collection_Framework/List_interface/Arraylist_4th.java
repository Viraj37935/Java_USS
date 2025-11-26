package list_interface;

import java.util.ArrayList;

public class Arraylist_4th {

	public static void main(String[] args) {
		
ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(56);
        list.add(123);

        // First element
        System.out.println(list.get(0));

        // Last element
        System.out.println(list.get(list.size() - 1));

        // Set first index to 1000
        list.set(0, 1000);
        System.out.println(list.get(0));

        // Check if list is empty
        System.out.println(list.isEmpty());

        // Check element present or not
        System.out.println(list.contains(123));
	}

}
