package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Time_Comparison {

	public static void main(String[] args) {


		ArrayList<Laptop> list=new ArrayList<>();
		
		for(int i=1;i<=100000;i++)
		{
			list.add(new Laptop(i,"a"+i,100.0+i,new int[] {12,34,56},"ab"+i));
		}
		long starttime=System.nanoTime();
		list.remove(9);
		long endtime=System.nanoTime();
		long total_time=endtime-starttime;
		System.out.println(total_time);
		
		//27200,50700,28000 =>9 (LL)
		//144800,73600,110800=>9 (AL)
	}

}

class Laptop {
	int id;
	String name;
	double price;
	int[] servicing;;
	String model;
	
	public Laptop(int id, String name, double price,int[] servicing, String model) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.servicing=servicing;
		this.model = model;
	}
	
	
}