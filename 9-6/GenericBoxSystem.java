/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package classhw.pkg9.pkg6;
import java.util.Scanner;

// Generic Box class
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericBoxSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating specific instances of the generic class
        Box<Integer> intBox = new Box<>();
        Box<String> strBox = new Box<>();
        
        boolean exit = false;
        String lastStoredType = "None"; // Tracks which box was updated last

        while (!exit) {
            System.out.println("\n--- Generic Box Menu ---");
            System.out.println("1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer value: ");
                    if (scanner.hasNextInt()) {
                        int intValue = scanner.nextInt();
                        intBox.set(intValue);
                        lastStoredType = "Integer";
                        System.out.println("Integer stored successfully.");
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.next(); // Clear bad input
                    }
                    break;
                case 2:
                    System.out.print("Enter a string value: ");
                    String strValue = scanner.nextLine();
                    strBox.set(strValue);
                    lastStoredType = "String";
                    System.out.println("String stored successfully.");
                    break;
                case 3:
                    if (lastStoredType.equals("Integer")) {
                        System.out.println("Currently stored value: " + intBox.get() + " (Type: Integer)");
                    } else if (lastStoredType.equals("String")) {
                        System.out.println("Currently stored value: " + strBox.get() + " (Type: String)");
                    } else {
                        System.out.println("The box is currently empty.");
                    }
                    break;
                case 4:
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