package queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_first {

	public static void main(String[] args) {
		 Deque<Integer> d1 = new ArrayDeque<Integer>();
		  
		  d1.add(5);
		  d1.add(4);
		  d1.add(7);
		  
//		  System.out.println(d1.remove());         //follow FIFO
		  
		  System.out.println(d1.removeLast());     //follow LIFO
				  
		


	}

}
