package pkg8.pkg6.pkgclass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueSortedNames {
    public static void main(String[] args) {

        // List of names with duplicates
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("John");
        names.add("David");
        names.add("Alice");
        names.add("Charlie");

        System.out.println("Original List: " + names);

        // Store names in a Set to remove duplicates
        Set<String> uniqueNames = new HashSet<>(names);

        // Convert Set back to List for sorting
        ArrayList<String> sortedNames = new ArrayList<>(uniqueNames);

        // Sort alphabetically
        Collections.sort(sortedNames);

        // Display result
        System.out.println("Unique Sorted Names: " + sortedNames);
    }
}