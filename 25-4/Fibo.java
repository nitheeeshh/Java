import java.util.Scanner;
class Fibo
{
	public static void main(String [] args)
	{
		Fibo fun = new Fibo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers needs to Fibo? : ");
		int n = sc.nextInt();
		fun.fiboo(n);
	}	
	void fiboo(int n)
	{	
		int firstTerm=0,secondTerm=1;
		for(int i=1;i<=n;++i)
		{
			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.println();
	}

}	