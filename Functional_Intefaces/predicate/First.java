package predicate;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		Predicate<Integer> pred = (i)->{return i < 10;};
		
		Predicate<Integer> pred2 = (j)->{return j%2==0;};
		
		Predicate<Integer> pred3=pred.and(pred2);
		
		System.out.println(pred3.test(45));
	}

}
