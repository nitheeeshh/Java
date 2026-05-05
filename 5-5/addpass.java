class addpass
{
	public static void main(String args[])
	{
		addpass f1=new addpass();
		int ar[]={10,20,30};
		f1.adps(ar);
		System.out.println("ar[0] is "+ar[0]);
		System.out.println("ar[1] is "+ar[1]);
		System.out.println("ar[2] is "+ar[2]);
	}
	void adps (int arr[])
	{
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		System.out.println("arr[0] is "+arr[0]);
		System.out.println("arr[1] is "+arr[1]);
		System.out.println("arr[2] is "+arr[2]);
	}
}