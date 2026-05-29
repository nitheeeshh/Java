import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder finalResult = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            finalResult.append(sb.reverse()).append(" ");
        }

        System.out.println("Output: " + finalResult.toString().trim());
        
        scanner.close();
    }
}