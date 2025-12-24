package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class Logical_q {
	
	/*
	  * Question - Counting the occurrence of characters
	  * 
	  * */


	public static void main(String[] args) {
		String s = "vyankteshwar";
		
		char[] chars = s.toCharArray();
			Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			
			
			//v y a n k t e s h w a r
			for(int i=0; i<chars.length; i++) {
				int counter = 1;
				
				if(map.containsKey(chars[i])){
				  counter = map.get(chars[i]) + 1;
				  map.put(chars[i], counter);
				}
				else {
					map.put(chars[i], counter);
				}
				
				
			}
			System.out.println(map);
			

	}

}
