package classhw.pkg9.pkg6;
import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WorkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Weekday Working System Menu ---");
            System.out.println("1. Check if day is Working Day");
            System.out.println("2. Check if day is Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a day: ");
                    try {
                        Day day = Day.valueOf(scanner.nextLine().toUpperCase());
                        if (day == Day.SATURDAY || day == Day.SUNDAY) {
                            System.out.println(day + " is NOT a working day.");
                        } else {
                            System.out.println(day + " IS a working day.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid day entered.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a day: ");
                    try {
                        Day d = Day.valueOf(scanner.nextLine().toUpperCase());
                        if (d == Day.SATURDAY || d == Day.SUNDAY) {
                            System.out.println(d + " IS a weekend.");
                        } else {
                            System.out.println(d + " is NOT a weekend.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid day entered.");
                    }
                    break;
                case 3:
                    System.out.println("Days of the week:");
                    for (Day val : Day.values()) {
                        System.out.println("- " + val);
                    }
                    break;
                case 4:
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