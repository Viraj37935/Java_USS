package first;


public class If {

	public static void main(String[] args) {
		
		double per = -58.98 ;
		
		if(per>=35 && per<50)
		{
			System.out.println("You Passed The Test!");
		}		
		else if (per>=50 && per<60)
		{
			System.out.println("Second Class");
		}
		else if (per>=60 && per<70)
		{
			System.out.println("First Class");
		}
		else if (per>=70 && per<100)
		{
			System.out.println("Distinct");
			
		}
		else
		{
			System.out.println("Hard Luck");
		}
	}

}

// If Their is fix value/ Range to find then we use && operator