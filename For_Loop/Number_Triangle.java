package first;

public class Number_Triangle {

	public static void main(String[] args) {
		
		 int I, J; // total number of rows
	        
	        for ( I = 1; I <= 7; I++) { // outer loop → row number
	            for ( J = 1; J <= I; J++) { // inner loop → repeat number
	                System.out.print(J + " "); // print number of the current row
	            }
	            System.out.println(); 
	        }

	}

}


