class binary
{
	public static void main(String args[])
	{
		binary f1=new binary();
		int ar[]={10,20,30,40,50,60,70,80,90,100};
		int target=30;
		int left=0;
		int right=ar.length-1;
		int res=f1.binary(ar,target,left,right);
		System.out.println(res);
	}
	int binary(int ar[],int target,int left,int right)
	{
		if(left>right)
		{
			return -1;
		}
		int mid=(left+right)/2;
		if(ar[mid]==target)
		{
			return mid;
		}
		if(ar[mid]<target)
		{
			left=mid+1;
			return binary(ar,target,left+1,right);
		}
		else
		{
			right=mid-1;
			return binary(ar,target,left,right+1); 
		}
	}
}