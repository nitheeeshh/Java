class binary
{
	public static void main(String args[])
	{
		binary f1= new binary();
		int age[]={29,30,22,20,21};
		f1.bin(age);
		for(int i=0;i<age.length;i++)
		{
			System.out.print(age[i]+" ");
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