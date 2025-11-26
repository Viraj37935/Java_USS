package custom;

public class Fourth_interface {

	public static void main(String[] args) {
		
		Convertor<String, Integer> toInt = (value)->{return Integer.parseInt(value);};
		System.out.println(toInt.convert("500"));
		
		Convertor<Integer, String> toString =(value)->{return "Java "+ value;};
		System.out.println(toString.convert(8));

	}

}

interface Convertor<T, R>{
	R convert(T value);
}
