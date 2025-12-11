package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Arbitory_methodref4 {

	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(new Product("Iphone", 50037.21),new Product("Laptop",78945.56),new Product("Watch", 4000));
		
		Consumer<Product> applyDiscount = Product::discount;
		
		list.stream().forEach(applyDiscount);
		
		list.stream().forEach(System.out::println);
	}
}

class Product 
{
	String name;
	double price;
	
	public Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	
	public void discount() {
		this.price = price * 0.90;
	}
	 public String toString() {
	        return name + ": " + price;
	    }
	
}