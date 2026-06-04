package javaapplication28;

import java.util.Scanner;

public class JavaApplication28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution inst = new Institution();
        Institution.Student student = inst.new Student();
        
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Number of Subjects: ");
                    int numSub = sc.nextInt();
                    student.addStudent(name, roll, numSub);
                    break;
                case 2:
                    student.addMarks(sc);
                    break;
                case 3:
                    student.calculateGrade();
                    break;
                case 4:
                    student.displayDetails();
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
    }
}
    
