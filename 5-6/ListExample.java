package pkg5.pkg6;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = new ArrayList<>();

        // Add 5 elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Initial List: " + numbers);

        // Insert an element at a specific index (index 2)
        numbers.add(2, 25);
        System.out.println("After inserting 25 at index 2: " + numbers);

        // Remove an element by value
        // Note: Integer.valueOf() is used to avoid confusing the value with the index
        numbers.remove(Integer.valueOf(40));
        System.out.println("After removing the value 40: " + numbers);

        // Update an element at a given index (update index 1 to 15)
        numbers.set(1, 15);
        System.out.println("After updating index 1 to 15: " + numbers);

        // Traverse and print all elements
        System.out.print("Traversing the List: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
