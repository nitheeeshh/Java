public class CountDigits 
{
    public static void main(String[] args) 
	{
        int number = 12345;
        int count = 0;
        int temp = number;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10; 
                count++;          
        }

        System.out.println("The number " + number + " has " + count + " digits.");
    }
}