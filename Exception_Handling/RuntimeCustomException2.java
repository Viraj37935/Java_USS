package RuntimeCustomException;

import java.util.Scanner;


public class RuntimeCustomException2 {

	public static void main(String[] args) {
        
		Voteing v = new Voteing();
		
		v.Dovote();
		
	}

}
class Voteing  {
	
	int age;
	
	public  void Dovote() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age= sc.nextInt();
		
		try {
		if(age<18) {
			
			throw new invalidAgeException("Not eligible for Vote");
		}
		System.out.println("Please Vote!");
		}
		catch(invalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();
		
		
	}
}

class invalidAgeException extends RuntimeException {
	
	public invalidAgeException (String msg) {
		
		super(msg);
	}
}