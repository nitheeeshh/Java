/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package classhw.pkg9.pkg6;
import java.util.Scanner;

// Generic Calculator bounded by Number
class Calculator<T extends Number> {
    
    public double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}

public class GenericCalculatorSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator<Number> calc = new Calculator<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Generic Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.println("Select Data Type: 1 for Integer, 2 for Double");
            int typeChoice = scanner.nextInt();

            if (typeChoice == 1) {
                System.out.print("Enter first integer: ");
                Integer a = scanner.nextInt();
                System.out.print("Enter second integer: ");
                Integer b = scanner.nextInt();

                if (choice == 1) {
                    // Casting to int for clean display, since we know inputs are ints
                    System.out.println("Result: " + (int) calc.add(a, b));
                } else {
                    System.out.println("Result: " + (int) calc.subtract(a, b));
                }

            } else if (typeChoice == 2) {
                System.out.print("Enter first double: ");
                Double a = scanner.nextDouble();
                System.out.print("Enter second double: ");
                Double b = scanner.nextDouble();

                if (choice == 1) {
                    System.out.println("Result: " + calc.add(a, b));
                } else {
                    System.out.println("Result: " + calc.subtract(a, b));
                }
            } else {
                System.out.println("Invalid type choice.");
            }
        }
        scanner.close();
    }
}