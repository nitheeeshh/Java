package classhw.pkg9.pkg6;
import java.util.Scanner;

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class OrderTrackingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        // Simulating an active order for tracking purposes
        OrderStatus currentStatus = OrderStatus.SHIPPED; 

        while (!exit) {
            System.out.println("\n--- Order Status Menu ---");
            System.out.println("1. Show Order Status");
            System.out.println("2. Check if Order is Completed");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Current Order Status is: " + currentStatus);
                    break;
                case 2:
                    if (currentStatus == OrderStatus.DELIVERED) {
                        System.out.println("Yes, the order is successfully completed (Delivered).");
                    } else if (currentStatus == OrderStatus.CANCELLED) {
                        System.out.println("The order was cancelled and is no longer active.");
                    } else {
                        System.out.println("No, the order is still in progress.");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}