class bin
{
	public static void main(String args[])
	{
		bin f1=new bin();
		int ar[]={10,20,30,40,50,60,70,80,90,100};
		int target=70;
		int res=f1.binary(ar,target);
		System.out.println(res);
	}
	int binary(int ar[],int target)
	{
		int left=0;
		int right=ar.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(ar[mid]==target)
			{
				return mid;
			}
			else if(ar[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid+1;
			}
		}
		return -1;
	}
}