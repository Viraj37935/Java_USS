package ibm;

import java.util.ArrayList;
import java.util.LinkedList; 
import java.util.List;

public class ListPerformanceTest {

	public static void main(String[] args) {
		 
		
		List<Integer> arrayList= new ArrayList<Integer>();
		List<Integer> linkedList =new LinkedList<Integer>();
		
		for(int i=0;i<100000;i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		//Insert in middle
		
		long start = System.nanoTime();
		arrayList.add(50000, 100);
		long end=System.nanoTime();
		System.out.println("ArrayList insert time: " + (end-start));
		
		 start = System.nanoTime();
		linkedList.add(50000, 100);
		 end=System.nanoTime();
		System.out.println("LinkedList insert time: " + (end-start));
	}

}
