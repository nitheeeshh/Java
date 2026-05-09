class Line
{
	public static void main(String args[])
	{
		Line f1=new Line(); 
		int ar[]={1,2,0,4,10,3,77};
		int target=99;
		int i=0;
		int result=f1.lin(ar,target,i);
		System.out.println(result);
	}
	int lin(int ar[],int target,int i)
	{
		if(i>ar.length)
		{
			return -1;
		}
		if(i<ar.length)
		{
			if(ar[i]==target)
			{
				return i;
			}
		}
		return lin(ar,target,i+1);
	}
}