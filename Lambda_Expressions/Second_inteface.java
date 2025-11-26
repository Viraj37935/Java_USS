package custom;

public class Second_inteface {

	public static void main(String[] args) {
		
		Format<String> upper =(str)->{return str.toUpperCase();};
		System.out.println(upper.format("wirting the lambda expression"));
		
		Format<String> reverse = (str)->{return new StringBuffer(str).reverse().toString();};
		System.out.println(reverse.format("wirting the lambda expression"));
		
		
	}

}

@FunctionalInterface
interface Format<T>{
	public T format(T str);
}