package assignments;

import java.util.ArrayList;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

class ATMSystem {
    public void run(Scanner scanner) {
        double balance = 5000.0; // Setting an initial balance for testing

        while (true) {
            System.out.println("\n--- ATM System ---");
            System.out.println("1. Withdraw money");
            System.out.println("2. Check account balance");
            System.out.println("3. Exit to Main Menu");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                try {
                    if (amount > balance) {
                        throw new InsufficientBalanceException("Withdrawal failed! Amount exceeds current balance.");
                    } else if (amount <= 0) {
                        System.out.println("Please enter a valid amount greater than zero.");
                    } else {
                        balance -= amount;
                        System.out.println("Successfully withdrawn: $" + amount);
                        System.out.println("Remaining Balance: $" + balance);
                    }
                } catch (InsufficientBalanceException e) {
                    System.out.println("Exception Caught: " + e.getMessage());
                }
            } else if (choice == 2) {
                System.out.println("Current Account Balance: $" + balance);
            } else if (choice == 3) {
                System.out.println("Exiting ATM System...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class SmartLoginSystem {
    public void run(Scanner scanner) {
        int attemptsRemaining = 3;
        String validUsername = "admin";
        String validPassword = "password123";

        while (true) {
            System.out.println("\n--- Smart Login System ---");
            System.out.println("1. Login");
            System.out.println("2. Exit to Main Menu");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                try {
                    if (attemptsRemaining <= 0) {
                        throw new AccountLockedException("Your account has been locked due to too many failed attempts.");
                    }

                    System.out.print("Enter Username: ");
                    String username = scanner.next();
                    System.out.print("Enter Password: ");
                    String password = scanner.next();

                    if (username.equals(validUsername) && password.equals(validPassword)) {
                        System.out.println("Login Successful! Welcome, " + username + ".");
                        attemptsRemaining = 3; // Reset attempts upon successful login
                    } else {
                        attemptsRemaining--;
                        if (attemptsRemaining == 0) {
                            throw new AccountLockedException("Maximum login attempts reached. Account is now LOCKED.");
                        } else {
                            System.out.println("Invalid credentials. Attempts remaining: " + attemptsRemaining);
                        }
                    }
                } catch (AccountLockedException e) {
                    System.out.println("Exception Caught: " + e.getMessage());
                }
            } else if (choice == 2) {
                System.out.println("Exiting Login System...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class StudentMarksSystem {
    public void run(Scanner scanner) {
        ArrayList<Integer> marksList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Enter student marks");
            System.out.println("2. Display marks");
            System.out.println("3. Exit to Main Menu");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student mark (0-100): ");
                int mark = scanner.nextInt();
                try {
                    if (mark < 0 || mark > 100) {
                        throw new IllegalArgumentException("Invalid Mark! Must be between 0 and 100.");
                    }
                    marksList.add(mark);
                    System.out.println("Mark successfully added.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Exception Caught: " + e.getMessage());
                }
            } else if (choice == 2) {
                if (marksList.isEmpty()) {
                    System.out.println("No marks have been recorded yet.");
                } else {
                    System.out.println("Stored Valid Marks: " + marksList);
                }
            } else if (choice == 3) {
                System.out.println("Exiting Student Marks System...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
