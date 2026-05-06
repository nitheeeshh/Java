class insertion
{
	public static void main(String args[])
	{
		byte old_ar[]={20,22,27,30,34};
		byte pos=4;
		byte new_ar[]=new byte[old_ar.length+1];
		byte newage=29;
		for(int i=0;i<pos-1;i++)
		{
			new_ar[i]=old_ar[i];
		}
		new_ar[pos-1]=newage;
		for(int i=pos-1;i<old_ar.length;i++)
		{
			new_ar[i+1]=old_ar[i];
		}
		for(int i=0;i<new_ar.length;i++)
		{
			System.out.println(new_ar[i]);
		}
	}
}