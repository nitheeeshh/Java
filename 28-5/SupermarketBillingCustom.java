
import java.util.Scanner;

public class SupermarketBillingCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack billingStack = new CustomStack(100); 
        int choice;

        do {
            System.out.println("\n--- Supermarket Billing System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Undo Last Item");
            System.out.println("3. View Last Scanned Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
                choice = 0;
                continue;
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = scanner.nextLine();
                    billingStack.push(item);
                    System.out.println("Item added: " + item);
                    break;
                case 2:
                    if (billingStack.isEmpty()) {
                        System.out.println("The bill is empty. Nothing to undo.");
                    } else {
                        String removedItem = billingStack.pop();
                        System.out.println("Removed last scanned item: " + removedItem);
                    }
                    break;
                case 3:
                    if (billingStack.isEmpty()) {
                        System.out.println("The bill is empty.");
                    } else {
                        System.out.println("Last scanned item: " + billingStack.peek());
                    }
                    break;
                case 4:
                    System.out.println("Scanned items: " + billingStack.displayAll());
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}