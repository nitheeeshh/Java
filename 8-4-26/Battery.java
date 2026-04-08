class Battery
{
	public static void main(String []args)
	{
		int battery = 100;
        if (battery >= 80) 
		{
            System.out.println("Battery Full");
        } 
        else if (battery >= 30) 
		{ 
            System.out.println("Battery Normal");
        } 
        else 
		{
            System.out.println("Low Battery – Charge Now");
        }
	}
}