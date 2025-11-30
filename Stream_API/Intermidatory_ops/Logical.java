package intermidatory_oprations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logical {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("parleg");
		list.add("happy-happy");
		list.add("good-day");
		list.add("bourbon");
		list.add("t20-t20");
		list.add("merrygold");
		list.add("patanjali");
		list.add("tiger");
		list.add("britania");
		list.add("bounce");
		list.add("biscuits");
		list.add("bournvita");

		list.stream()
		.map((i)->{return i.toUpperCase();})
		.filter((i)->{ return i.startsWith("B");})
		.map((i)->{return i.length();})
		.distinct()
		.sorted(new reverseint())
		.forEach((i)->{System.out.println(i);});
	}

}
class reverseint implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1,o2);
	}
	
}