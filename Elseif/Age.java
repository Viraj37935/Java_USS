package first;

public class Age {

	public static void main(String[] args) {
		
		int age = 25 ;
		
		if (age> 0 && age <= 10 )
		{
			System.out.println("You are in Child age");
		}
		else if (age > 10 && age <= 20)
		{
			System.out.println("You are in Teenage ");
		}
		else if (age > 20 && age <= 30)
		{
			System.out.println("You are in Adult age");
		}
		else 
		{
			System.out.println("You are in Old age ");
		}

	}

}
