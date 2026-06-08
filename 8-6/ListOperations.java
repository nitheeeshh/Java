package pkg8.pkg6.pkgclass;
import java.util.ArrayList;
import java.util.Collections;

public class ListOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 integers
        numbers.add(15);
        numbers.add(8);
        numbers.add(23);
        numbers.add(42);
        numbers.add(7);
        numbers.add(16);
        numbers.add(31);
        numbers.add(10);
        numbers.add(5);
        numbers.add(28);

        System.out.println("Original List: " + numbers);

        // Remove all even numbers
        numbers.removeIf(num -> num % 2 == 0);

        // Sort remaining elements in ascending order
        Collections.sort(numbers);

        // Print final list
        System.out.println("Final List: " + numbers);
    }
}