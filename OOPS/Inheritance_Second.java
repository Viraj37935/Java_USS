package Inheritance;

public class Inheritance_Second {

	public static void main(String[] args) {
		
		Car B = new Car (new int[] {10}, Car.arr2) ;
		
		
	}

}


class Car {
	
	static int[][] arr2=new int [0][0];
	
	public Car (float f) {
		
		this(new int[] {10,20});
		System.out.println("C");
	}
	
	public Car (int[] arr) {
		System.out.println("D");
	}
	
	public Car(int [] arr2, int[][] arr3) {
		
		this(0.0f);
		System.out.println("E");
	}
}