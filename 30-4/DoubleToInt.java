import java.util.Scanner;

public class DoubleToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the double value
        double num = scanner.nextDouble();
        
        // Explicit casting from double to int
        int convertedNum = (int) num; 
        
        // Output the result
        System.out.println(convertedNum);
        
        scanner.close();
    }
}