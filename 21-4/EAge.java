import java.util.Scanner;
class EAge
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee strength:");
		byte size= sc.nextByte();
		byte arr[]=new byte[size];
		boolean prg=true;
		do{
		System.out.println("1. Insert employee age ");
		System.out.println("2. Display All employee age ");
		System.out.println("3. Sum of all employee age ");
		System.out.println("4. Print Even age ");
		System.out.println("5. Print Maximum age in employee ");
		System.out.println("6. Print Minimum age in employee ");
		System.out.println("7. Count of employee ");
		System.out.println("8. Exit ");
		byte choice=sc.nextByte();
		switch(choice)
		{
		  case 1:
		    {
			     for(int i=0;i<arr.length;i++)
		      {
			   System.out.println("Enter the"+i+"st employee age: ");
			   arr[i]=sc.nextByte();
		      }
	        }break;
			case 2:
			{
				for(int i=0;i<arr.length;i++)
		      {
			   System.out.println("Employee"+i+" Age: "+arr[i]);
		      }
			}break;
			case 3:
			{
				int a=0;
				for(int i=0;i<arr.length;i++)
		      {
			   a=a+arr[i];
		      }
			  System.out.println(a);
			}break;
			case 4:
			{
				System.out.print("The even ages are ");
				for(int i=0;i<arr.length;i++)
		      {
			   if(arr[i]%2==0)
			   {
			   System.out.print(" "+arr[i]+" ");
			   }		      
			  }
			  System.out.println(" ");
			}break;
			case 5:
			{
				byte max=0;
		        for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>max)
					{
					max=arr[i];
					}
				}		
				System.out.println("highest age is "+max);
			}break;
			case 6:
			{
				byte min=arr[0];
		        for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<min)
					{
					min=arr[i];
					}
				}		
				System.out.println("lowest age is "+min);
			}break;
			case 7:
			{
				System.out.println("Employee count is "+arr.length);
			}break;
			case 8:
			{
				System.out.println("Exiting");
				prg=false;
			}break;
		}
		}while(prg);
	}
}