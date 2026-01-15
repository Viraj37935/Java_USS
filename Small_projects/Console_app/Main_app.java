package console_application;

import java.util.Scanner;

public class Main_app {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("\1. Insert User");
			System.out.println("2. Exit");
			System.out.println("Enter Choice: ");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
			
			System.out.println("Enter ID:");
			int id = scan.nextInt();
			
			System.out.println("Enter NAME:");
			String name = scan.next();
			
			System.out.println("Enter EMAIL:");
			String email = scan.next();
			
			User_task task = new User_task(id, name, email);
			Thread t = new Thread(task);
			t.start();
			}
		else {
            System.out.println("Application Closed");
            break;
        }
	}
		   scan.close();
}
	}
