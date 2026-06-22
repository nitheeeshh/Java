package javaapplication56;


import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employees[] = new Employee[100];
        int count = 0;
        int choice;

        do {

            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    employees[count] = new Employee(id, name, department);

                    count++;

                    System.out.println("Employee Added Successfully");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Employees Found");
                    } else {

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nEmployee " + (i + 1));
                            employees[i].display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == searchId) {

                            System.out.println("\nEmployee Found");
                            employees[i].display();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}