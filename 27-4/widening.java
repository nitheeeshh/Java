class widening
{
	public static void main(String args[])
	{
		//widening
		byte a=10;
		int b=a;
		System.out.println(b);
		
		//narrowing
		int a1=100;
		byte b1=(byte)a1;
		System.out.println(b1);
		
		//Boxing
		float balance=1000.78f;
		String s=Float.toString(balance);
		System.out.println(s);
		
		//UnBoxing
		String s1="11.11";
		double c1=Double.parseDouble(s1);
		System.out.println(c1);

		
	
	}
}