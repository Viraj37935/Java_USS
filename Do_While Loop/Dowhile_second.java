package first;


import java.util.*;

public class Dowhile_second {

	public static void main(String[] args) {
		
		Scanner X = new Scanner (System.in);
		
		int choice = 0; 
		
		do 
		{
			System.out.println("\n ---  Restruant Menu ---");
			System.out.println("1. Pizza ");
			System.out.println("2. Burger");
            System.out.println("3. Pasta");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            choice = X.nextInt();
            
            switch (choice)
            {
            case 1 -> System.out.println("You chose Pizza");
            case 2 -> System.out.println("You chose Burger");
            case 3 -> System.out.println("You chose Pasta");
            case 4 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice");
            
         }

	}
		while (choice != 4);
		X.close();
}

}
