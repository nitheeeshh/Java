package pkg5.pkg6;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map of student ID -> student name
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        System.out.println("Initial Map: " + students);

        // Retrieve value using key
        String studentName = students.get(102);
        System.out.println("Student with ID 102 is: " + studentName);

        // Update a value (Using the same key overwrites the old value)
        students.put(103, "Charlie Smith");
        System.out.println("After updating Charlie's name: " + students);

        // Remove a key-value pair
        students.remove(101);
        System.out.println("After removing student 101: " + students);

        // Display all keys and values
        System.out.println("Current directory of students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}