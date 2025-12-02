package set_interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Set<Car> four_w=new HashSet<Car>();
		
		
		
		
		Car c=new Car(1,"AMG",12.69);
		Car c1=new Car(2,"M550i",85.69);
		Car c2=new Car(1,"AMG",12.69);

		 
		
		four_w.add(c2);
		four_w.add(c1);
		four_w.add(c);
		
		System.out.println(four_w);
		
	}

}

class Car 
{
	int id ;
	String name;
	double price;
	
	
	
	public Car(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
	public  int hashCode()
	{
		System.out.println("hashset using the .hashcode()");
		return  Objects.hash(this.id,this.name,this.price);
	}
	
	public boolean equals(Object o)
	{

		if (this == o) return true;
	    if (o == null || !(o instanceof Car)) return false;
		 
		System.out.println("using .equals()");
		Car b=(Car)o;
		
		return this.id==b.id && this.price==b.price && this.name.equals(b.name);
		
		
	}
	
	
}