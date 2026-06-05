package pkg5.pkg6;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set of integers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Add elements (including duplicates)
        uniqueNumbers.add(5);
        uniqueNumbers.add(10);
        uniqueNumbers.add(15);
        uniqueNumbers.add(10); // Duplicate, will be ignored
        uniqueNumbers.add(5);  // Duplicate, will be ignored

        // Display the set
        System.out.println("Set elements (Notice duplicates are missing): " + uniqueNumbers);

        // Check if an element exists
        boolean hasFifteen = uniqueNumbers.contains(15);
        System.out.println("Does the set contain 15? " + hasFifteen);

        // Remove an element
        uniqueNumbers.remove(10);
        System.out.println("After removing 10: " + uniqueNumbers);

        // Iterate through the set
        System.out.print("Iterating through the Set: ");
        for (Integer num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}