package copy_constructor;

public class Custom_logical2 {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Laptop", 65000);
        Product p2 = new Product(p1);

        p2.price = 60000;

        System.out.println(p1.price); // 65000
        System.out.println(p2.price); // 60000

	}

}
class Product {
    int id;
    String name;
    double price;

  public  Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

   public Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }
}