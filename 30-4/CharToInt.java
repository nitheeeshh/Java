import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a single character
        char ch = scanner.next().charAt(0);
        
        // Implicit casting from char to int
        int asciiValue = ch; 
        
        // Output the result
        System.out.println(asciiValue);
        
        scanner.close();
    }
}