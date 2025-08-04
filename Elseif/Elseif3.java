package first;

public class Elseif3 {

	public static void main(String[] args) {
		
		double temp = 85;
		
		if(temp <= 95 && temp < 98.6 )
		{
			System.out.println("Normal");
		}
		else if (temp <= 98.6 && temp < 100.4)
		{
			System.out.println("Low-grade fever");
		}
		else if (temp <= 100.4 && temp < 103)
		{
			System.out.println("Moderate fever");
		}
		else if (temp <= 103 && temp < 105.00)
		{
			System.out.println("High fever - Get Medical Help");
		}
		else
		{
			System.out.println("Invalid temerature");
		}

	}

}
