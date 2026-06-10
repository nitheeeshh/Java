package pkg10.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String department;
    double basicSalary;

    Employee(int empId, String empName, String department, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.05;

        return basicSalary + hra + da - pf;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("----------------------------");
    }
}

public class EmployeePayrollManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Employee Payroll Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Employee ID already exists!");
                    } else {
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Basic Salary: ");
                        double salary = sc.nextDouble();

                        employees.add(new Employee(id, name, dept, salary));
                        System.out.println("Employee added successfully!");
                    }
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    id = sc.nextInt();

                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    found = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            System.out.print("Enter New Basic Salary: ");
                            e.basicSalary = sc.nextDouble();
                            System.out.println("Salary updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    found = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            System.out.println("Net Salary = " + e.calculateNetSalary());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Employee ID to delete: ");
                    id = sc.nextInt();

                    found = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            employees.remove(e);
                            System.out.println("Employee deleted successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}