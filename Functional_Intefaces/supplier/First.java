package supplier;

import java.util.function.Supplier;

public class First {

	public static void main(String[] args) {

		Supplier<Integer> sup = () -> {
			return 10 + 15;
		};

		Supplier<String> sup1 = () -> {
			return "Java" + "" + "Devloper";
		};

		System.out.println(sup.get());
		System.out.println(sup1.get());
	}

}
