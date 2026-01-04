package copy_constructor;

public class Deepcopy_cloneable1 {
	/**
	 * In Java, object cloning is done using the clone() method with the Cloneable marker interface.
	 * @throws CloneNotSupportedException 
	 * 
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		STD s1 = new STD(101, "Viraj");
        STD s2 = (STD) s1.clone();

        s2.name = "Rahul";

        System.out.println(s1.name); // Viraj
        System.out.println(s2.name); // Rahuls
		
	}

}
class STD implements Cloneable {
    int id;
    String name;

   public STD(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}