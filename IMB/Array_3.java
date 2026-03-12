package ibm;

import java.util.HashSet;
import java.util.Set;

public class Array_3 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,3,5,6};
		
		Set<Integer> set =new HashSet<Integer>();
		for(int i: arr) {
			set.add(i);
			System.out.println(set);
		}

	}

}
