package custom;

public class Third_interface {

	public static void main(String[] args) {

		Validate<String> email = (value) -> {
			return value.contains("@") && value.endsWith(".com");
		};
		System.out.println(email.isValid("jhondeo123@gmail.com"));
		// System.out.println(email.isValid("javalearn.com"));

		Validate<String> pass = (value) -> {
			return value.length() > 8;
		};
		System.out.println(pass.isValid("viraj"));

	}

}

@FunctionalInterface
interface Validate<T> {

	boolean isValid(T value);
}
