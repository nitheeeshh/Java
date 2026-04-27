import java.util.Scanner;
class Prac
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		Prac p=new Prac();
		p.mainn();
	}
	void mainn()
	{
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
		System.out.println("4. Reverse ");
		System.out.println("5. Exit ");
		byte choice=sc.nextByte();
		switch(choice)
		 {
		  case 1:
		  {
			  displayallnumbers(start,end);
		  }break;
		  case 2:
		  {
			  sumnumbers(start,end);
		  }break;
		  case 3:
		  {
			  evennumbers(start,end);
		  }break;
		  case 4:
		  {
			  reverse(start,end);
		  }break;
		  case 5:
			{
				System.out.println("Exiting");
				prg=false;
			}break;
		  }
		}while(prg);	
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
	
	void reverse(int start,int end)
	{
		for(int i=end;i>=start;i--)
		{			
		 System.out.println(i);
		}
	}
}