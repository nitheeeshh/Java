package bank;
import java.util.Scanner;

public class Bank {
    
    public static final String BANK_NAME = "ABC Bank";
    public static final double INTEREST_RATE = 7.5;

    public static double calculateInterest(double principal, int years) {
        return (principal * INTEREST_RATE * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        double interest = calculateInterest(principal, years);
        System.out.println("\nBank Name: " + BANK_NAME);
        
        if (principal == (long) principal) {
            System.out.println("Principal Amount: " + (long) principal);
        } else {
            System.out.println("Principal Amount: " + principal);
        }
        
        System.out.println("Years: " + years);
        System.out.println("Interest Amount: " + interest);

        scanner.close();
    }
}
