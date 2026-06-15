package pkg15.pkg6;

import java.util.Scanner;

class pass extends Exception
{
        public pass (String s)
        {
        super(s);
        }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Id No: ");
        String input=sc.nextLine();
        try {
        int in=Integer.parseInt(input);
      
        if(in<=0)
        {
            throw new pass("Your Id must be positive");
        }
        else
        {
            System.out.println("Valid User ID: " + in);
        }
        }
        catch(NumberFormatException e)
        {System.out.println("Id must be in number only! ");
        }
         catch (pass e) {
            System.out.println(e.getMessage());
        }
    }
}