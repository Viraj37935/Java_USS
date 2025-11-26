package list_interface;

import java.util.Arrays;
import java.util.List;


public class Arraylist_2nd {

	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(10, 50, 30, 20, 40);
		
		int num = Integer.MIN_VALUE;
		int num2 = Integer.MIN_VALUE;
		
		for(int i : obj) {
			if(i > num) {
				num2 = num;
				num	= i;
			}
			else if(i > num2 &&  i != num) {
				num2=num;
			}
		}
		
		System.out.println("Second Large no :" + num2);
		

	}

}
