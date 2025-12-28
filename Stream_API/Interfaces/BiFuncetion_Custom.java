package functional_interface;

import java.util.function.BiFunction;

public class BiFuncetion_Custom {

	public static void main(String[] args) {
		 
		BiFunction<Product, Integer, Integer> totalamt = (p, tax) -> p.price * p.quantity+tax;
		
		Product p = new Product(200, 5);
		
		System.out.println("Total Amount :" + totalamt.apply(p, 50));
	}

}

class Product {
	int price;
	int quantity;
	
	public Product(int price, int quantity) {
		
		this.price=price;
		this.quantity=quantity;
	}
}