class swap
{
	public static void main(String args[])
	{
		int ar[]={10,20,30};
		System.out.println("Before Swapping");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(" ");
		System.out.println("After Swapping");
		int temp=ar[0];
		ar[0]=ar[1];
		ar[1]=ar[2];
		ar[2]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}