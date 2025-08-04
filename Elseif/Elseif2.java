package first;

public class Elseif2 {

	public static void main(String[] args) {
		
		int age = 45; 
		
		if (age >= 0 && age < 18) 
		{
		    System.out.println("Not eligible");
		}
		else if (age >= 18 && age <= 25)
		{
		    System.out.println("Eligible for Student Loan");
		} 
		else if (age >= 26 && age <= 35) 
		{
		    System.out.println("Eligible for Personal Loan");
		} 
		else if (age >= 36 && age <= 60) 
		{
		    System.out.println("Eligible for Home Loan");
		}
		else if (age > 60 && age < 100)
		{
		    System.out.println("Eligible for Senior Citizen Loan");
		} 
		else
		{
		    System.out.println("Invalid age input");
		}

	}

}
