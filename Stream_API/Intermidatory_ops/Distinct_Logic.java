package intermidatory_oprations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Distinct_Logic {

	public static void main(String[] args) {
		Business business1 = new Business(1, "SaniKa Entr.", 67897.56, "Itery");
		Business business2 = new Business(2, "Atharva Entr.", 56.09, "Travels");
		Business business3 = new Business(3, "Namrta Entr.", 8740.89, "Sea");
		Business business4 = new Business(4, "Ghatage Entr.", 90900.09, "Travels");
		Business business5 = new Business(5, "Padmaja Entr.", 909.09, "Travels");

		List<Business> list = new ArrayList<>();
		list.add(business5);
		list.add(business4);
		list.add(business3);
		list.add(business2);
		list.add(business1);

		// Stream API Operation
		list.stream().sorted() // Highest turnover first
				.distinct() // Unique departments
				.forEach(i -> System.out.println(i));

	}

}

class Business implements Comparable<Business> {
	int id;
	String name;
	String dept;
	double turnover;

	public Business(int id, String name, double turnover, String dept) {
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.dept = dept;
		
	}

	// Sorting by highest turnover
	public int compareTo(Business o) {
		return Double.compare(o.turnover, this.turnover);
	}

	// Check Unique by department
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Business))
			return false;
		Business o = (Business) obj;
		return Objects.equals(this.dept, o.dept);
	}

	public int hashCode() {
		return Objects.hash(dept);
	}

	public String toString() {
		return this.name + " " + this.turnover + " " + this.dept;
	}
}