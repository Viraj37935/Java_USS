package intermidatory_oprations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Custom_Logic2 {

	public static void main(String[] args) {

		Car c1 =new Car(1,"Slavia",534.59,"BMW");
		Car c2 =new Car(2,"Hector",8869.42,"MG");
		Car c3 =new Car(3,"Fortuner",7934.59,"Toyota");
		Car c4 =new Car(4,"550i",9534.59,"BMW");
		Car c5 =new Car(5,"AMG",6534.59,"BMW");

		 List<Car> list = new ArrayList<>();
		 list.add(c1);
		 list.add(c2);
		 list.add(c3);
		 list.add(c4);
		 list.add(c5);
		 
		 list.stream()
		 .sorted(new TurnComparator())
		 .distinct()
		 .forEach((i)->{System.out.println(i);});
	}

}
 class Car implements Comparable<Car> 
 {
	 int id;
	 String name;
	 double price;
	 String company;
	 
	 public Car(int id, String name, double price, String company)
	 {
		 this.id=id;
		 this.name=name;
		 this.price=price;
		 this.company=company;
		 
	 }
	 
	@Override
	public int compareTo(Car o) {
		return Double.compare( o.price, this.price);
	}
	
	public int hashCode()
	{
		return Objects.hash(company);
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(!(obj instanceof Car))
			return false;
		Car o=(Car)obj;
		return Objects.equals(this.company, o.company);
	}
	
	public String toString() {
		return this.price+" "+this.name+" "+this.company;
	}
 }
 class TurnComparator implements Comparator<Car>
 {

 	@Override
 	public int compare(Car o1, Car o2) {

                   return Double.compare(o2.price, o1.price);
 	}
 	
 }
 