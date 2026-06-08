package newpackage;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable; // true = Available, false = Issued

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default status is available
    }

    @Override
    public String toString() {
        String status = isAvailable ? "Available" : "Issued";
        return "Book ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Status: " + status;
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewAllBooks(); break;
                case 3: searchBook(); break;
                case 4: issueBook(); break;
                case 5: returnBook(); break;
                case 6: deleteBook(); break;
                case 7: System.out.println("Exiting system..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        
        if (findBookIndex(id) != -1) {
            System.out.println("Error: Book ID already exists.");
            return;
        }

        scanner.nextLine(); // Consume newline
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        library.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    private static void viewAllBooks() {
        if (library.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : library) {
            System.out.println(b);
        }
    }

    private static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = scanner.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            System.out.println(library.get(index));
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = scanner.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            Book b = library.get(index);
            if (b.isAvailable) {
                b.isAvailable = false;
                System.out.println("Book issued successfully!");
            } else {
                System.out.println("Warning: Book is already issued.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            Book b = library.get(index);
            if (!b.isAvailable) {
                b.isAvailable = true;
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Warning: Book is already available in the library.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        int index = findBookIndex(id);
        if (index != -1) {
            library.remove(index);
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static int findBookIndex(int id) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).bookId == id) {
                return i;
            }
        }
        return -1;
    }
}