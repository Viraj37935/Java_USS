package list_interface;

import java.util.Vector;

public class Vector_Second {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<String>();
		
		vec.add("Hii");
		vec.add("Viraj");

		System.out.println(vec);
		
		String st= vec.remove(0); //remove element by index.
		
		System.out.println(st);
		System.out.println(vec);
	}

}
