package first;


import java.util.*;

public class Dowhile_third {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();
        
        String again;
        
        do 
        {
            int roll = rand.nextInt(6) + 1;
            System.out.println("You rolled: " + roll);
            System.out.print("Roll again? (yes/no): ");
            again = sc.next().trim().toLowerCase();
        } 
        while (again.equals("yes"));
        
        sc.close();
    }
}

