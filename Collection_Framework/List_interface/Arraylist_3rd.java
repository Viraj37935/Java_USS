	package list_interface;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	
	public class Arraylist_3rd {
	
		public static void main(String[] args) {
			
			ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,4,8,1,2,4,8,9,6,7));
			
			ArrayList<Integer> ans = new ArrayList<Integer>();
			
			for (Integer i : arr) {
				if (!ans.contains(i)) {
			        ans.add(i);
			    }
			}
			
			System.out.println("Original: " + arr);
			System.out.println(arr.size());
			System.out.println("Without Duplicate: " + ans);
		}
	
	}
