package Abstraction;

public class Ab_1 {

	public static void main(String[] args) {
		
		Animal obj = new Dog();
		
		obj.sound();
		obj.eat();
	}

}

abstract class Animal {
	
	abstract  void sound();
	
	void eat() {
		
		System.out.println("Animal Are Eating");
	}
	
}

class Dog extends Animal {
	
	void sound() {
		System.out.println("Dog is Barking");
	}
}