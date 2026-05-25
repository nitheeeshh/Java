class miss
{
	public static void main(String args[])
	{
		int ar[]={2,3,4,6};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]+1==ar[i+1])
			{
				System.out.print(ar[i]);	
			}
			else 
			{
				System.out.print(ar[i]+1);
			}
		}
	}
}