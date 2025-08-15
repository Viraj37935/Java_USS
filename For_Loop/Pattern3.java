package first;

public class Pattern3 {

	public static void main(String[] args) {

		int I, J; 
		
		for (I = 7; I >= 1; I--) 
		{
			for(J = 1; J <= I; J++)
			{
				System.out.println(J + " ");
			}
			System.out.println();
		}
		
		for(I = 1; I <= 7; I++)
		{
			for(J = 1; J <= I; J++)
			{
				System.out.println(J + " ");
			}
			System.out.println();
		}

	}

}
