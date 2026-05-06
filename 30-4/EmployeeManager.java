import java.util.Scanner;

class EmployeeManager {
    
    int[] ids = new int[100]; 
    int count = 0;            
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create an instance (object) of our class
        EmployeeManager manager = new EmployeeManager();
        // Tell that object to start running the menu
        manager.runMenu(); 
    }

    // Main menu loop (no 'static' or 'public')
    void runMenu() {
        System.out.println("Menu:\n1. Add employee ID\n2. Remove employee ID\n3. Display employee IDs\n4. Exit");
        boolean running = true;

        while (running) {
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    System.out.println("\nExiting.");
                    running = false; // Stops the loop
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        scanner.close();
    }

    // Function to add an employee (no 'static' or 'public')
    void addEmployee() {
        if (count < ids.length) {
            System.out.print("Enter employee ID: ");
            ids[count] = scanner.nextInt();
            count++; 
            System.out.println("Employee ID added.");
        } else {
            System.out.println("System full. Cannot add more IDs.");
        }
    }

    // Function to remove an employee (no 'static' or 'public')
    void removeEmployee() {
        System.out.print("Enter employee ID to remove: ");
        int targetId = scanner.nextInt();
        boolean found = false;
        
        for (int i = 0; i < count; i++) {
            if (ids[i] == targetId) {
                // Shift all elements to the left to cover the gap
                for (int j = i; j < count - 1; j++) {
                    ids[j] = ids[j + 1];
                }
                count--; 
                found = true;
                System.out.println("Employee ID removed.");
                break; 
            }
        }
        
        if (!found) {
            System.out.println("Employee ID not found.");
        }
    }

    // Function to display employees (no 'static' or 'public')
    void displayEmployees() {
        System.out.println("\nEmployee IDs:");
        if (count == 0) {
            System.out.println("List is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(ids[i] + " ");
            }
            System.out.println(); // Print a blank line at the end
        }
    }
}