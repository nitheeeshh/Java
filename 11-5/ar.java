class ar
{
	public static void main(String args[])
	{
		int ar[]={9,1,8,2,7,3};
		int target = 10;
		boolean result=true;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					if(ar[i]+ar[j]==target)
					{
						System.out.println(ar[i]+" "+ar[j]);
					}
				}
			}
		}
	}
}
