class MixOpe
{
    public static void main(String[] args) 
	{
        int a = 10, b = 5, c = 15;
        boolean exp1 = (a + b) == c;
        boolean exp2 = (a * 2 > c) && (b < a);
        boolean exp3 = (c - a != b) || (a / 2 == b);
        System.out.println("Result of (a + b) == c: " + exp1);
        System.out.println("Result of (a * 2 > c) && (b < a): " + exp2);
        System.out.println("Result of (c - a != b) || (a / 2 == b): " + exp3);
    }
}