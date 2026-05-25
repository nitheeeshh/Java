import java.util.Scanner;
class ques1
{
	public static void main(String args[])
	{
		
		ques1 f1= new ques1();
		
		Scanner scanner = new Scanner(System.in);
        int ar1[]=new int[3];
		int ar2[]=new int[3];
		
		
		System.out.println("Enter the a1 elements max[3]: ");
		for(int i=0;i<ar1.length;i++)
		{
		ar1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the a2 elements max[3]: ");
		for(int i=0;i<ar2.length;i++)
		{
		ar2[i] = scanner.nextInt();
		}
		
		int ar3[]=new int[6];
		for(int i=0;i<ar1.length;i++)
		{
			ar3[i]=ar1[i];
		}
		
		for(int i=0;i<ar2.length;i++)
		{
			ar3[i+3]=ar2[i];
		}
		
		f1.bin(ar3);
		
		System.out.println(" ");
		
		for(int i=0;i<ar3.length;i++)
		{
			System.out.print(ar3[i]);
		}
	
	}
	void bin(int ar[])
	{
		for(int j=0;j<ar.length;j++)
		{
			for(int i=0;i<ar.length-1;i++)
			{
				if(ar[i]>ar[i+1])
				{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
				else
				{
				}
			}
		}
	}
}