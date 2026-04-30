import java.util.Scanner;
class TotalEmployee
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		TotalEmployee f1=new TotalEmployee();
		f1.menu();
	}
	void menu()
	{
		System.out.println("Enter the Employee Strength : ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean prg=true;
		do{
		System.out.println("1.Insert the Salary");
		System.out.println("2.Maximum Salary");
		System.out.println("3.Minimum Salary");
		System.out.println("4.Total Salary");
		System.out.println("5.Exit");
		byte choice=sc.nextByte();
		if(choice==1)
		{
			insert(ar);
		}
		if(choice==2)
		{
			max(ar);
		}
		if(choice==3)
		{
			min(ar);
		}
		if(choice==4)
		{
			total(ar);
		}
		if(choice==5)
		{
			System.out.println("Exiting...");
			prg=false;
		}
		else
		{
			System.out.println("Enter a valid data");
		}}while(prg);
	}
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Enter the a{"+i+"} salary: ");
			arr[i]= sc.nextInt();
		}
	}
	void max(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("The maximum salary is "+max);
	}
	void min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("The minimum salary is "+min);
	}
	void total(int arr[])
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=arr[i]+total;
		}
		System.out.println(total);
	}
}