package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_second {

	/*
	 * 
	 * 
	 * - hashCode() & .equals() in case of same key- - if hashcode is same for two
	 * keys then -> - it will check the .equals(), if equals gives true then it will
	 * override the value - if .equals() give false, but hashcode is same then it is
	 * compulsion to hashmap to place key-value pair in same hash-bucket causing
	 * hahsh-collision
	 * 
	 */

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "ABC");
		map.put(2, "DFG");
		map.put(3, "PQR");
		map.put(4, "JKL");
		map.put(5, "MNO");
		map.put(6, null);

		System.out.println(map);
		System.out.println(map.get(5)); // to get specific key

		System.out.println(map.containsKey(8));
		System.out.println(map.containsValue("PQR"));

		map.putIfAbsent(7, "STU"); // add value if key is absent or null
		System.out.println(map);
		map.putIfAbsent(6, "VWX"); // update value because value is null
		map.putIfAbsent(5, "YZ"); // not update because value are there already

		map.put(5, "abc");
		System.out.println(map);  //here hashcode for key is same as well as equals() true, then it will ovverride the value		

	}

}
