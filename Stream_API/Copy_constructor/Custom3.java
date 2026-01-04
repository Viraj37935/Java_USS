package copy_constructor;

public class Custom3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cart c1 = new Cart(new int[]{10, 20, 30});
        Cart c2 = (Cart) c1.clone();

        c2.items[0] = 99;

        System.out.println(c1.items[0]); // 10 ✅

	}

}
class Cart implements Cloneable {
    int[] items;

   public Cart(int[] items) {
        this.items = items;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cart copy = (Cart) super.clone();
        copy.items = items.clone(); // deep copy of array
        return copy;
    }
}