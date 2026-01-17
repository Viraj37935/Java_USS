package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_logical {

	public static void main(String[] args) {
		 
		 List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(10);
	        list.add(30);
	        list.add(20);
	        
	     ArrayList<Integer> unique = new ArrayList<>();
	     
	     for (Integer i : list) {
	    	 if(!unique.contains(i)) {
	    		 unique.add(i);
	    	 }
	     }
	     System.out.println(unique);
	}

}
