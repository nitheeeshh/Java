class refpass
{
	public static void main(String args[])
	{
		refpass f1=new refpass();
		int a = 5;	
		int b = 10;
		f1.refp(a,b);
		a=10;
		b=20;
		c=a+b;
		System.out.println("a+b is "+c);
	}
	void refp(int c,int d)
	{
		int e=c+d;
		System.out.println("c+d is "+e);
	}
	
}