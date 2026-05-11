import java.util.Scanner;
import java.util.Arrays;
class MergeSortOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;
        int choice;
        MergeSortOperations sorter = new MergeSortOperations();

        do {
            System.out.println("\n--- Merge Sort Menu ---");
            System.out.println("1. Enter Array");
            System.out.println("2. Sort in Ascending Order (Merge Sort)");
            System.out.println("3. Sort in Descending Order (Merge Sort)");
            System.out.println("4. Find Median");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            choice = scanner.nextInt();

            if (choice >= 2 && choice <= 5 && arr == null) {
                System.out.println("Error: Please enter the array first (Option 1).");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("Array size must be greater than 0.");
                        arr = null;
                    } else {
                        arr = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        System.out.println("Array initialized successfully.");
                    }
                    break;

                case 2:
                    sorter.mergeSort(arr, 0, arr.length - 1, true);
                    System.out.println("Array sorted in Ascending Order.");
                    break;

                case 3:
                    sorter.mergeSort(arr, 0, arr.length - 1, false);
                    System.out.println("Array sorted in Descending Order.");
                    break;

                case 4:
                    sorter.findMedian(arr);
                    break;

                case 5:
                    System.out.println("Current Array: " + Arrays.toString(arr));
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
	
    void mergeSort(int[] arr, int left, int right, boolean ascending) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid, ascending);
            mergeSort(arr, mid + 1, right, ascending);
            merge(arr, left, mid, right, ascending);
        }
    }

    void merge(int[] arr, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            boolean condition = ascending ? (L[i] <= R[j]) : (L[i] >= R[j]);
            
            if (condition) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void findMedian(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        mergeSort(copyArr, 0, copyArr.length - 1, true);

        int n = copyArr.length;
        if (n % 2 != 0) {
            System.out.println("Median is: " + copyArr[n / 2]);
        } else {
            double median = (copyArr[(n - 1) / 2] + copyArr[n / 2]) / 2.0;
            System.out.println("Median is: " + median);
        }
    }
}