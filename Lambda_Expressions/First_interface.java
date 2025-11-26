package custom;

public class First_interface {

	public static void main(String[] args) {
		
		Calculator<Integer> obj = (i,j)->{return i+j;};
		System.out.println("Addition:" +obj.calculate(15, 89));
		
		Calculator<Integer> obj2 = (i,j)->{return i*j;};
		System.out.println("Multiply:"+ obj2.calculate(25, 76));
		
		Calculator<Integer> obj3 = (i,j) -> {return i/j;};
		System.out.println("Division: "+ obj3.calculate(88, 46));
		
			
	}

}

@FunctionalInterface
interface Calculator<T> {
	public T calculate(T i, T j);
}