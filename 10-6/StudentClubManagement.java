package pkg10.pkg6;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentClubManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> members = new HashSet<>();

        while (true) {
            System.out.println("\n===== Student Club Management =====");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Count Members");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();

                    if (members.add(name)) {
                        System.out.println("Member added successfully!");
                    } else {
                        System.out.println("Member already exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Member Name to remove: ");
                    name = sc.nextLine();

                    if (members.remove(name)) {
                        System.out.println("Member removed successfully!");
                    } else {
                        System.out.println("Member not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Member Name to search: ");
                    name = sc.nextLine();

                    if (members.contains(name)) {
                        System.out.println("Member found in the club.");
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    if (members.isEmpty()) {
                        System.out.println("No members in the club.");
                    } else {
                        System.out.println("Club Members:");
                        for (String member : members) {
                            System.out.println(member);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total Members: " + members.size());
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}