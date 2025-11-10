package CustomException;

import java.util.Scanner;

public class CustomException1 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		Vote v = new Vote();
		
		v.Dovote();
	}

}

class Vote  {
	
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

class invalidAgeException extends Exception {
	
	public invalidAgeException (String msg) {
		
		super(msg);
	}
}