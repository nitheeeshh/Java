import java.util.Scanner;
class Age
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strength:");
		byte size= sc.nextByte();
		byte arr[]=new byte[size];
		System.out.println("Enter the ages:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the:"+i+": ");
			arr[i]=sc.nextByte();
		}
		byte max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			max=arr[i];
			}
		}		
		System.out.println("highest age is "+max);
	}
}