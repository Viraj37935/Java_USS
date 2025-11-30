package intermidatory_oprations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Custom_Distinct {

	public static void main(String[] args) {
		Mobile mobile=new Mobile(11111,"Micromax");
		Mobile mobile2=new Mobile(11111,"Micromax");
		Mobile mobile3=new Mobile(4897,"Samsung");
		Mobile mobile4=new Mobile(4897,"Samsung");
		Mobile mobile5=new Mobile(89,"Apple");
		Mobile mobile6=new Mobile(89,"Apple");
		
		List<Mobile> list=new ArrayList<Mobile>();
		list.add(mobile6);
		list.add(mobile5);
		list.add(mobile4);
		list.add(mobile3);
		list.add(mobile2);
		list.add(mobile);
		
		list.stream().distinct().forEach((i)->{System.out.println(i);});
	}

}
class Mobile
{
	double price;
	String model;
	
	public Mobile(double price, String model)
	{
		this.price=price;
		this.model=model;
	}
	
	
	public int hashCode()
	{
		System.out.println("A");
		return Objects.hash(this.model,this.price);
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("B");
		Mobile mob=(Mobile)obj;
		
		return this.price==mob.price && this.model.equals(mob.model);
	}
}