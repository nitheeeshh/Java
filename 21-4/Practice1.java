// enter the start number:
// enter the end number:
// 1.displayallnumbers
// 2. sumnumbers
// 3.evennumbers
// 4.exit
import java.util.Scanner;
class Practice1
{
	public static void main(String [] args)
	{
		Practice1 p=new Practice1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start number: ");
		int start= sc.nextInt();
		System.out.print("Enter the end number: ");
		int end= sc.nextInt();
		boolean prg=true;
		do
		{
		System.out.println("1. Display all Numbers ");
		System.out.println("2. Sum all Numbers ");
		System.out.println("3. Display Even Numbers ");
		System.out.println("4. Exit ");
		byte choice=sc.nextByte();
		switch(choice)
		 {
		  case 1:
		  {
			  p.displayallnumbers(start,end);
		  }break;
		  case 2:
		  {
			  p.sumnumbers(start,end);
		  }break;
		  case 3:
		  {
			  p.evennumbers(start,end);
		  }break;
		  case 4:
			{
				System.out.println("Exiting");
				prg=false;
			}break;
		  }
		}
		while(prg);
	}
	void displayallnumbers(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}

	}
	void sumnumbers(int start,int end)
	{
		int a=0;
		for(int i=start;i<=end;i++)
		{
			a=a+i;
		}
        System.out.println(a);
	}
	void evennumbers(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				 System.out.println(i);
			}
		}
	}
}