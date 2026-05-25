class Question3 
{
    public static void main(String args[])
    {
        Question3 f1= new Question3();
        int ar1[]={0,5,1,2,3,0};
		int ar2[]={3,4,5,2,7};
		int max; int min;
		if(ar1.length<ar2.length)
		{
			max=ar2.length;
			min=ar1.length;
		}
		else
		{
			max=ar1.length;
			min=ar2.length;
		}
        for(int i=0;i<max;i++)
		{
			for (int j=0;j<min;j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.println(ar1[i]);
				}
			}
		}
    }
    
    void binary (int ar[])
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