package first;

public class Elseif1 {

	public static void main(String[] args) {
		
		int amount = 1500;
		
		
		if (amount >= 5000)
		{
		    System.out.println("You get 20% Discount");
		} 
		else if (amount >= 3000 && amount < 5000)
		{
			System.out.println("You get 15% Discount");
		} 
		else if (amount >= 1000 && amount < 3000)
		{
			System.out.println("You get 10% Discount");
		} 
		else if (amount >= 0 && amount < 1000) 
		{
			System.out.println("You get 0% Discount");
		} 
		else 
		{
		    System.out.println("Invalid bill amount!");
		}
 
	}

}


