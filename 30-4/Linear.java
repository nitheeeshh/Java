class Linear
{
	public static void main(String args[])
	{
		Linear f1=new Linear(); 
		int ar[]={1,2,0,4,10,3,77};
		int target=10;
		int result=f1.lin(ar,target);
		System.out.println(result);
	}
	int lin(int ar[],int target)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{	
				return i;
			}
			else
			{
				
			}
		}
		return -1;
	}
}