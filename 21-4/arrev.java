class arrev
{
	public static void main(String args[])
	{
		arrev f1= new arrev();
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int i=arr.length-1;
		f1.rev(arr,i);
	
	}
	void rev(int ar[],int i)
	{
		if(ar[i]>=0)
		{
			System.out.println(ar[i]);
			i--;
			rev(ar,i);
		}
	}
}