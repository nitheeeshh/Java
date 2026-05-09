import java.util.Scanner;
class CountForty {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int count = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
		{
            numbers[i] = scanner.nextInt();
            if (numbers[i] == 40) 
			{
                count++;
            }
        }
        System.out.println("The number 40 appears " + count + " time(s) in the array.");
    }
}