package Abstraction;

public class Interface_2 {

	public static void main(String[] args) {
		
		I_Animal a = new Cat();
		
		a.Eat();

		a.Run();
	}

}

interface I_Animal {
	
	public void Eat();
	
	public void Run(); 
}

class Cat  implements I_Animal {

	@Override
	public void Eat() {
		
		System.out.println(" Cat is Eating ");
		
	}

	@Override
	public void Run() {
		
		System.out.println("Cat is running ");
		
	}
	
	
}