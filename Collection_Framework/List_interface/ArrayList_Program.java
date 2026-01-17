package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.addFirst(10); // add in First
		list.add(15); // By Default add in last
		list.add(20);
		list.addLast(25); // Add in Last

		System.out.println(list); // print the list
		
		System.out.println("*************************************");
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Viraj");
		names.add("Rahul");
		names.add("Amit");
		
		System.out.println(names);
		System.out.println(names.get(0));
		
		names.remove(2);
		System.out.println(names);
	}

}
