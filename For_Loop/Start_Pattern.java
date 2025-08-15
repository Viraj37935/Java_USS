package first;

public class Start_Pattern {

	public static void main(String[] args) {

		 int rows = 5; // total number of rows
	        
	        for (int i = 1; i <= rows; i++) { // outer loop → controls rows
	        	
	            for (int j = 1; j <= i; j++) { // inner loop → controls stars in each row
	            	
	                System.out.print("* ");
	            }
	            
	            System.out.println(); // move to next line after inner loop
	        }

	}

}

