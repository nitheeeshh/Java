package HW_25_06.Ques1;

public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Employee Management System");
        System.out.println("--------------------------");
        
        Employee emp = new Employee("Alice", 50000.0);
        Manager mgr = new Manager("Bob", 80000.0, "IT");
        
        emp.displayInfo();
        System.out.println();
        mgr.displayInfo();
    }
}