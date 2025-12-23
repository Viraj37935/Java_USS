package set_interface;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparator_first {

	/*
	 * Comparator<T>-(Custom sorting) - it is functional. interface - it has method
	 * - compare(T o1, T o2); for sorting & adding element - called custom sorting
	 * because sorting logic provide in different. class - if method return 0, means
	 * 2 object. are same so it will not add in TreeSet - we can provide different.
	 * logics by creating different. classes and pass the reference. of those
	 * classes in TreeSet Constructor
	 **/

	public static void main(String[] args) {
		Set<Car_f1> tree = new TreeSet<Car_f1>(new SpeedComparator());

		tree.add(new Car_f1(105, "hundai"));
		tree.add(new Car_f1(101, "Honda"));
		tree.add(new Car_f1(103, "suzuki"));

		System.out.println(tree);

	}

}

class Car_f1 {
	int speed;
	String name;

	public Car_f1(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}

	public String toString() {
		return this.name +" "+  this.speed;
	}

}

class SpeedComparator implements Comparator<Car_f1> {

	@Override
	public int compare(Car_f1 o1, Car_f1 o2) {

		return o2.speed - o1.speed;
	}

}

class Name1Comparator implements Comparator<Car_f1> {

	@Override
	public int compare(Car_f1 o1, Car_f1 o2) {

		return o1.name.compareTo(o2.name);
	}

}
