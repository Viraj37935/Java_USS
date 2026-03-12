package ibm;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		String str="programming";
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(map,0)+1);
		}
		System.out.println(map);
	}

}
