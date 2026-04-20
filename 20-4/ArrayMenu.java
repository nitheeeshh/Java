import java.util.Scanner;

public class ArrayMenu 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0, choice;

        do {
            System.out.print("\n1.Insert 2.Display 3.Even 4.Odd 5.Exit\nChoice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Size: ");
                n = sc.nextInt();
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            } 
            else if (choice == 2) {
                for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
            } 
            else if (choice == 3 || choice == 4) 
			{
                int count = 0;
                for (int i = 0; i < n; i++) 
				{
                    if (choice == 3 && arr[i] % 2 == 0) count++;
                    if (choice == 4 && arr[i] % 2 != 0) count++;
                }
                System.out.println("Count: " + count);
            }
        } while (choice != 5);
    }
}