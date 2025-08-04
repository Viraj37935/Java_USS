package first;

public class For_Loop3 {

	public static void main(String[] args) {
		
		int[] steps = {6000, 7000, 8000, 8500, 9000, 8200,7500};
		
		for(int day = 0; day < steps.length; day++) 
		{
			System.out.println("Day " + (day + 1)+ " : "  + steps[day] +  " steps ");
		}
	}

}
