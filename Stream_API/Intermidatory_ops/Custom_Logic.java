package intermidatory_oprations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Custom_Logic {

	public static void main(String[] args) {
		 
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(10);
		list1.add(15);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(25);
		list2.add(30);
		List<Integer> list3=new ArrayList<Integer>();
		list3.add(35);
		list3.add(40);
		list3.add(45);
		
		List<Integer> list4=new ArrayList<Integer>();
		list4.add(50);
		list4.add(55);
		list4.add(60);
		
		List<List<Integer>> List_2D_1 =new ArrayList<List<Integer>>();
		List_2D_1.add(list1);
		List_2D_1.add(list2);
		
		
		List<List<Integer>> List_2D_2 =new ArrayList<List<Integer>>();
		List_2D_2.add(list3);
		List_2D_2.add(list4);
		
		List<List<List<Integer>>> List_3D=new ArrayList<List<List<Integer>>>();
		
		List_3D.add(List_2D_1);
		List_3D.add(List_2D_2);
		
		List_3D.stream().forEach((i)->{i.stream().forEach((j)->{j.stream().forEach((k)->{System.out.println(k*2);});});});
		
		List_3D.stream().forEach((i)->{System.out.println(i);});
	}
	

}
