import java.util.Scanner;
public class BankingSystem {
    double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem account = new BankingSystem();
        int choice;

        do {
            System.out.println("\n--- Basic Banking System ---");ll
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than $0.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: " + amount);
            } else {
                System.out.println("Transaction failed: Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than $0.");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}