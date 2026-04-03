class RotateThreeNumbers 
{
    public static void main(String[] args) 
	{
        int a = 5;
        int b = 15;
        int c = 25;
        System.out.println("Before:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        int temp = c;
        c = b;       
        b = a;        
        a = temp;     
        System.out.println("After:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}