import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementSystem {

    // Database connection parameters - Update these with your local database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "password"; 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Insert Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Search Student by Email");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                continue;
            }

            switch (choice) {
                case 1:
                    insertStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudentByEmail();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option from 1 to 6.");
            }
        }
        scanner.close();
    }

    private static void insertStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Fee: ");
        double fee = 0;
        try {
            fee = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid fee format. Operation cancelled.");
            return;
        }

        String query = "INSERT INTO student (name, email, course, fee) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, course);
            pstmt.setDouble(4, fee);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Database Error during insertion: " + e.getMessage());
        }
    }

    private static void viewAllStudents() {
        String query = "SELECT * FROM student";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\n--- All Students ---");
            System.out.printf("%-5s | %-20s | %-25s | %-15s | %-10s%n", "ID", "Name", "Email", "Course", "Fee");
            System.out.println("--------------------------------------------------------------------------------------");
            
            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                System.out.printf("%-5d | %-20s | %-25s | %-15s | %.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course"),
                        rs.getDouble("fee"));
            }
            if (!hasData) {
                System.out.println("No students found in the database.");
            }
        } catch (SQLException e) {
            System.out.println("Database Error while fetching records: " + e.getMessage());
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Operation cancelled.");
            return;
        }

        System.out.print("Enter New Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter New Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter New Fee: ");
        double fee = 0;
        try {
            fee = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid fee format. Operation cancelled.");
            return;
        }

        String query = "UPDATE student SET name = ?, email = ?, course = ?, fee = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, course);
            pstmt.setDouble(4, fee);
            pstmt.setInt(5, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student ID " + id + " updated successfully!");
            } else {
                System.out.println("Update failed. No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Database Error during update: " + e.getMessage());
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format. Operation cancelled.");
            return;
        }

        String query = "DELETE FROM student WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Delete failed. No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Database Error during deletion: " + e.getMessage());
        }
    }

    private static void searchStudentByEmail() {
        System.out.print("Enter Student Email to search: ");
        String email = scanner.nextLine();

        String query = "SELECT * FROM student WHERE email = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, email);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("\n--- Student Found ---");
                    System.out.println("ID:     " + rs.getInt("id"));
                    System.out.println("Name:   " + rs.getString("name"));
                    System.out.println("Email:  " + rs.getString("email"));
                    System.out.println("Course: " + rs.getString("course"));
                    System.out.println("Fee:    " + rs.getDouble("fee"));
                } else {
                    System.out.println("No student found with the email: " + email);
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Error during search: " + e.getMessage());
        }
    }
}
