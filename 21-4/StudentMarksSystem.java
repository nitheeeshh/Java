import java.util.Scanner;

public class StudentMarksSystem {
	
    int[] marks = new int[5]; 
    boolean marksEntered = false; 
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        StudentMarksSystem student = new StudentMarksSystem();
        
        int choice;

        do {
			
            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Enter marks");
            System.out.println("2. Calculate total");
            System.out.println("3. Calculate average");
            System.out.println("4. Find grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
			
            switch (choice) {
                case 1:
                    student.getMarks(scanner);
                    break;
                case 2:
                    if (student.marksEntered) {
                        System.out.println("Total Marks: " + student.total());
                    } else {
                        System.out.println("Please enter marks first (Option 1).");
                    }
                    break;
                case 3:
                    if (student.marksEntered) {
                        System.out.println("Average Marks: " + student.average());
                    } else {
                        System.out.println("Please enter marks first (Option 1).");
                    }
                    break;
                case 4:
                    if (student.marksEntered) {
                        System.out.println("Grade: " + student.grade());
                    } else {
                        System.out.println("Please enter marks first (Option 1).");
                    }
                    break;
                case 5:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
	
    void getMarks(Scanner scanner) {
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        marksEntered = true; 
        System.out.println("Marks entered successfully!");
    }
	
    int total() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }
	
    double average() {
        return (double) total() / marks.length;
    }
	
    String grade() {
        double avg = average();
        
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}