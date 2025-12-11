package method_reference;

import java.util.Arrays;
import java.util.List;

public class Arbitory_methodref5 {

	public static void main(String[] args) {

		List<Book> list = Arrays.asList(new Book(1, 2.4, "abc"), new Book(2, 3.4, "abcd"), new Book(3, 4.4, "abcde"));
		
		list.stream()
		.map(Book::sendre)
		.forEach(System.out::println);
	}
	

}

class Book {
	int id;
	double price;
	String name;

	public Book(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public int gettotal() {
		return this.id + (int) price + this.name.length();

	}

	public int gettotal(String str) {
		return str.length() + 1;
	}

	public int sendre()

	{
		return 100;
	}
}