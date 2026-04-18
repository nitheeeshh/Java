public class starhash 
{
    public static void main(String[] args) 
 {
	for(int i=1;i<=4;i++)
	{
	 if(i%2==0)
	 {
	  for(int j=1;j<=3;j++)
	  {
		 System.out.print("* ");
	  }
	 }
	 else
	  {
		for(int j=1;j<=3;j++)
	  {
		 System.out.print("# ");
	  } 
	 }
	 System.out.println("");
	}
 }
}