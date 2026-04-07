class Logi 
{
    public static void main(String[] args) 
	{
        int a = 10;
        int b = 5;
        boolean resultAnd = (a > 0) && (b < 10);      
        boolean resultOr = (a == 5) || (b == 5);
        boolean resultNot = !(a > b);
        System.out.println("Result of (a > 0 && b < 10): " + resultAnd);
        System.out.println("Result of (a == 5 || b == 5): " + resultOr);
        System.out.println("Result of !(a > b): " + resultNot);
    }
}