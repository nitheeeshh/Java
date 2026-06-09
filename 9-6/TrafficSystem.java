package classhw.pkg9.pkg6;
import java.util.Scanner;

enum TrafficSignal {
    RED("Stop"), 
    YELLOW("Wait/Caution"), 
    GREEN("Go");

    private String meaning;

    TrafficSignal(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}

public class TrafficSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Traffic Signal Menu ---");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter signal (RED, YELLOW, GREEN): ");
                    try {
                        TrafficSignal signal = TrafficSignal.valueOf(scanner.nextLine().toUpperCase());
                        System.out.println("Meaning: " + signal.getMeaning());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid signal entered.");
                    }
                    break;
                case 2:
                    System.out.print("Enter signal (RED, YELLOW, GREEN): ");
                    try {
                        TrafficSignal sig = TrafficSignal.valueOf(scanner.nextLine().toUpperCase());
                        if (sig == TrafficSignal.GREEN) {
                            System.out.println("You can GO.");
                        } else {
                            System.out.println("You must STOP or WAIT.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid signal entered.");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}