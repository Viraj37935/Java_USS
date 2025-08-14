package first;

import java.util.*;

public class Dowhile {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		
		int PIN = 1234;
		int num = 0;
		
		do 
		{
			System.out.println("Enter Pin :");
			num = obj.nextInt();
			
			if(num == PIN)
			{
			    System.out.println("Access grant");
			}	
			else {
				System.out.println("Wrong pin ! try again"); //condition
			}
		}
		
		while(PIN != num);
		
		obj.close();
	

	}


}
