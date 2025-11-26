package Collection_Typesafe;

public class Colletion_1 {

	public static void main(String[] args) {
		
		/**
		 * Declare type safe using Wrapper Class 
		 */
		Box<Integer> b = new Box<Integer>();
		
		b.set(100);
		System.out.println("Integer Value: " + b.get());
		
		
		Box<String> b2 = new Box<>();
		
		b2.set("Viraj");
		System.out.println("String value "+ b2.get());
	}

}

/**
 *  Making box class Type safe 
 * @param <T> is nothing but placeholder
 */
class Box<T> {   
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}