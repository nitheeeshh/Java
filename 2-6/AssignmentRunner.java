package assignments;

import java.util.Scanner;

public class AssignmentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=================================");
            System.out.println("      MASTER APPLICATION MENU    ");
            System.out.println("=================================");
            System.out.println("1. Run ATM System");
            System.out.println("2. Run Smart Login System");
            System.out.println("3. Run Student Marks System");
            System.out.println("4. Exit Entire Application");
            System.out.print("Select the program to run: ");
            
            int mainChoice = scanner.nextInt();
            
            switch (mainChoice) {
                case 1:
                    new ATMSystem().run(scanner);
                    break;
                case 2:
                    new SmartLoginSystem().run(scanner);
                    break;
                case 3:
                    new StudentMarksSystem().run(scanner);
                    break;
                case 4:
                    System.out.println("Shutting down... Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
    }
}