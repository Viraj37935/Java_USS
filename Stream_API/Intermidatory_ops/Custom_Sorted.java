package intermidatory_oprations;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Queue;

public class Custom_Sorted {

	public static void main(String[] args) {

		Queue<Plant> obj = new ArrayDeque<Plant>();
		
		obj.add(new Plant(256.97,"Rose"));
		obj.add(new Plant(86.24,"Jaswand"));
		obj.add(new Plant(79.52, "Garja"));
		
		obj.stream().sorted(new treenamecomparator()).forEach((i)->{System.out.println(i);});

	}

}
class Plant implements Comparable<Plant>
{
	double price;
	String name;
	public Plant (double price, String name)
	{
		this.price=price;
		this.name=name;
	}
	
	public String toString()
	{
		return this.price+" "+this.name;
	}

	@Override
	public int compareTo(Plant o) {
		
		return Double.compare(o.price, this.price);
	}
}

class treenamecomparator implements Comparator<Plant>
{

	@Override
	public int compare(Plant o1, Plant o2) {
		return Integer.compare(o2.name.length(), o1.name.length());
	}
	
}