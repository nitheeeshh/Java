import java.util.Scanner;

public class ArraySearchMenu {
    private static int[] arr = new int[1000];
    private static int n = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================");
            System.out.println("          MENU          ");
            System.out.println("========================");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertElements(scanner);
                    break;
                case 2:
                    displayElements();
                    break;
                case 3:
                    if (n == 0) {
                        System.out.println("\nArray is empty! Please insert elements first.");
                    } else {
                        System.out.print("\nEnter the element to search for: ");
                        int target = scanner.nextInt();
                        linearSearch(target);
                    }
                    break;
                case 4:
                    if (n == 0) {
                        System.out.println("\nArray is empty! Please insert elements first.");
                    } else {
                        System.out.print("\nEnter the element to search for: ");
                        int target = scanner.nextInt();
                        binarySearch(target);
                    }
                    break;
                case 5:
                    System.out.println("\nExiting program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select a valid option from 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void insertElements(Scanner scanner) {
        System.out.print("\nEnter the number of elements you want to insert: ");
        n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements inserted successfully!");
    }

    private static void displayElements() {
        if (n == 0) {
            System.out.println("\nThe array is currently empty.");
            return;
        }

        System.out.print("\nArray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void linearSearch(int target) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("\n[Linear Search] Element " + target + " found at index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\n[Linear Search] Element " + target + " not found in the array.");
        }
    }

    private static void customSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void binarySearch(int target) {
        System.out.println("\nSorting the array for Binary Search...");
        customSort();

        System.out.print("Sorted ");
        displayElements();

        int left = 0;
        int right = n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("\n[Binary Search] Element " + target + " found at index " + mid + ".");
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("\n[Binary Search] Element " + target + " not found in the array.");
        }
    }
}