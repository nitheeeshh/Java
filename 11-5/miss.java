class miss
{
	public static void main(String args[])
	{
		miss f1= new miss();
		int ar[]={108,107,105,104};	
		f1.bin(ar);
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]+1==ar[i+1])
			{
				System.out.print("");	
			}
			else
			{
				System.out.print(ar[i]+1);
			}
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