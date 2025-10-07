package Polymorphism;

public class First_Polymorphism {

	public static void main(String[] args) {

		Aeroplane i = new Aeroplane();

		i.OnBorad("Indigo");
		i.A_num = "543!@vshv";

		i.Filghts();
	}

}

class Aeroplane {

	String A_num;
	String flight;

	public void Filghts() {

		System.out.println("Attention Next Flight " + flight + A_num);
	}

	public String OnBorad(String name) {

		this.flight = name;
		return name;

	}
}
