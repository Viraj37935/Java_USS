package ibm;

import java.util.HashSet;

public class Array_1 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,3,1};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: arr) {
			set.add(i);
		}
		System.out.println(set);
	}

}
