class ReverseCharArray 
{
    public static void main(String[] args) 
	{
		
        char[] chars = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        
        System.out.print("Original Array: ");
        System.out.println(chars);
		
        int left = 0;
        int right = chars.length - 1;

        while (left < right) 
		{
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed Array: ");
        System.out.println(chars);
    }
}