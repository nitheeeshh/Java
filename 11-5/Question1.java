class Question1 
{
    public static void main(String args[])
    {
        Question1 f1= new Question1();
        int arr[]={9,0,8,2,3,0};
        f1.binary(arr);
        for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
    }
    
    void binary (int ar[])
    {
        for(int j=0;j<ar.length;j++)
		{
			for(int i=0;i<ar.length-1;i++)
			{
				if(ar[i]<ar[i+1])
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
