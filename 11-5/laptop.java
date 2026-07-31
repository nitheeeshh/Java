class laptop
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Scanner se = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		int id=nextInt();
		System.out.print("Enter your Password : ");
		String pass=nextLine();
		if(id==1&&pass.equals("zoro"))
		{
			System.out.print("Login Succesfully");
		}
		else
		{
			System.out.print("Login Failed");
		}
	}
}