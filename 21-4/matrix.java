import java.util.Scanner;
class Matrix
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows= sc.nextInt();
		System.out.println("Enter the no of columns:");
		int cols= sc.nextInt();
		int arr[][]=new int[rows][cols];
		int ar[][]=new int[rows][cols];
		System.out.println("For 1st Matrix");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				System.out.println("Enter the value of "+ i + " " + j +" ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("For 2nd Matrix");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				System.out.println("Enter the value of "+ i + " " + j +" ");
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of Matrix 1+2");
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++) 
			{
				System.out.print(arr[i][j]+ar[i][j]+" "); 
			}
			System.out.println();
		}
	}
}