package javaapplication26;
public class DelayPrinter {
    public static void main(String[] args) {
        System.out.println("Starting the count...");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted.");
                Thread.currentThread().interrupt(); 
            }
        }
        
        System.out.println("Done!");
    }
}