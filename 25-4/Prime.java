import java.util.Scanner;
class Prime
{
	public static void main(String [] args)
	{
		Prime fun = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		fun.prim(n);
	}	
	void prim(int n)
	{	
		boolean primee=true;
		if(n<=1)
		{
			primee=false;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					primee=false;
					break;
				}
			}
		}
		if(primee==true)
		{
		System.out.print("The given "+n+" is prime");
		}
		else
		{
		System.out.print("The given "+n+" is not prime");	
		}
	}

}	