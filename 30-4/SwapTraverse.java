import java.util.Scanner;
class SwapTraverse
{
	Scanner sc=new Scanner(System.in);
	Scanner se=new Scanner(System.in);
	
	public static void main(String args[])
	{
		SwapTraverse f1=new SwapTraverse();
		f1.menu();
	}
	void menu()
	{
		String ar[]=new String[3];
		boolean prg=true;
		do{
		System.out.println("1.Insert");
		System.out.println("2.Traverse");
		System.out.println("3.Swap");
		System.out.println("4.Insertion");
		System.out.println("5.Delection");
		System.out.println("6.Exit");
		byte choice=sc.nextByte();
		if(choice==1)
		{
			insert(ar);
		}
		if(choice==2)
		{
			traverse(ar);
		}
		if(choice==3)
		{
			swap(ar);
		}
		if(choice==4)
		{
			swap(ar);
		}
		if(choice==5)
		{
			swap(ar);
		}
		if(choice==6)
		{
			System.out.println("Exiting...");
			prg=false;
		}
		else
		{
			System.out.println("Enter a valid option!");
		}}while(prg);
	}
	void insert(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the a name: ");
			arr[i]= se.nextLine();
		}
	}
	void traverse(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void swap(String ar[])
	{
		System.out.println("Before Swapping");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(" ");
		System.out.println("After Swapping");
		String temp=ar[0];
		ar[0]=ar[1];
		ar[1]=ar[2];
		ar[2]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void insertion(String ar[])
	{
		System.out.println("Before Swapping");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(" ");
		System.out.println("After Swapping");
		String temp=ar[0];
		ar[0]=ar[1];
		ar[1]=ar[2];
		ar[2]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void deletion(String ar[])
	{
		byte pos=4;
		byte new_ar[]=new byte[old_ar.length-1];
		for(int i=0;i<pos-1;i++)
		{
			new_ar[i]=old_ar[i];
		}
		for(int i=pos-1;i<new_ar.length;i++)
		{
			new_ar[i]=old_ar[i+1];
		}
		for(int i=0;i<new_ar.length;i++)
		{
			System.out.println(new_ar[i]);
		}
	}
}