package restaurantordercustom;

import java.util.Scanner;

public class RestaurantOrderCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue orderQueue = new CustomQueue();
        int choice;

        do {
            System.out.println("\n--- Restaurant Order System ---");
            System.out.println("1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. View Next Order");
            System.out.println("4. Display All Orders");
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
                    System.out.print("Enter order: ");
                    String order = scanner.nextLine();
                    orderQueue.enqueue(order); 
                    System.out.println("Order added: " + order);
                    break;
                case 2:
                    if (orderQueue.isEmpty()) {
                        System.out.println("No pending orders to serve.");
                    } else {
                        String servedOrder = orderQueue.dequeue();
                        System.out.println("Served order: " + servedOrder);
                    }
                    break;
                case 3:
                    if (orderQueue.isEmpty()) {
                        System.out.println("No pending orders.");
                    } else {
                        System.out.println("Next order: " + orderQueue.peek());
                    }
                    break;
                case 4:
                    System.out.println("Pending orders: " + orderQueue.displayAll());
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