package terminal_operation;

import java.util.Arrays;
import java.util.List;

public class Reduce_Custom {

	public static void main(String[] args) {
		 
		List<Car> cars = Arrays.asList(
				new Car(1,"BMW",86.25),
				new Car(2, "Audi", 95.10),  
				new Car(3, "Jaguar", 75.80)
			);
		
		Car high = cars.stream()
					   .reduce((c1,c2)-> c1.price > c2.price ? c1 : c2)
					   .orElse(null);
		
		System.out.println("Highest Price Car:" + high.name + " " + high.price);
	}

}

class Car {
	
	int id;
	String name;
	double price;
	
	public Car(int id, String name, double price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}
}