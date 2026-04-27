import java.util.Scanner;
class Pracc
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		Pracc p=new Pracc();
		p.mainn();
	}
	void mainn()
	{
		System.out.print("Enter the array size: ");
		int size= sc.nextInt();
		int ar[]=new int[size];
		boolean prg=true;
		do
		{
		System.out.println("1. Insert ");
		System.out.println("2. Max value ");
		System.out.println("3. Min value ");
		System.out.println("4. Exit ");
		byte choice=sc.nextByte();
		switch(choice)
		 {
		  case 1:
		  {
			  insert(ar);
		  }break;
		  case 2:
		  {
			  max(ar);
		  }break;
		  case 3:
		  {
			  min(ar);
		  }break;
		  case 4:
			{
				System.out.println("Exiting");
				prg=false;
			}break;
		  }
		}while(prg);	
	}
	
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Enter the a{"+i+"} value: ");
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
		System.out.println("The maximum value is "+max);
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
		System.out.println("The minimum value is "+min);
	}
}