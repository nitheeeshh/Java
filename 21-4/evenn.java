class evenn
{
	public static void main(String args[])
	{
		evenn f1= new evenn();
		f1.even(0);
	
	}
	void even(int i)
	{
		if(i<=20)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			even(i+1);
		}
	}
}