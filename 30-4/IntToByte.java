import java.util.Scanner;

public class IntToByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer value
        int num = scanner.nextInt();
        
        // Explicit casting from int to byte
        byte convertedNum = (byte) num; 
        
        // Output the result
        System.out.println(convertedNum);
        
        scanner.close();
    }
}