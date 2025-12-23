package list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIst_1st {
	/*
	 * LinkedList- 
	 * - internally used doubly linkedList (2 nodes, 1 element)
	 * - maintain insertion order
	 * - linkedlList is node-based (not index-based)
	 * - to add multiple null & duplicates possible
	 * 
	 * 
	 * - useful for frequent insertion & deletion operation   O(1)
	 * - not useful for random access of element   O(n)
	 * 
	 * 
	 * */


	public static void main(String[] args) {

		List<String> list=new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("LinkedList: "+list);
	}

}
