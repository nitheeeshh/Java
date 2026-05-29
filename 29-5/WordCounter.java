import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int charCount = 0;
        int vowelCount = 0;
        
        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char c = lowerCaseSentence.charAt(i);
            
            if (c != ' ') {
                charCount++;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        String[] words = sentence.trim().split("\\s+");
        int wordCount = sentence.trim().isEmpty() ? 0 : words.length;

        System.out.println("Total number of characters (without spaces): " + charCount);
        System.out.println("Total number of words: " + wordCount);
        System.out.println("Total number of vowels: " + vowelCount);
        
        scanner.close();
    }
}