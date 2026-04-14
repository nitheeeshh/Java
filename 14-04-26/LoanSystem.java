import java.util.Scanner;
class LoanSystem 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Bank Loan Eligibility System =====");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter CIBIL Score: ");
        int cibil = sc.nextInt();
        System.out.print("Are you an Existing Customer? (true/false): ");
        boolean isExistingCustomer = sc.nextBoolean();
        System.out.println("\nChecking Loan Eligibility...\n");

        if (age >= 21) 
		{
            if (salary >= 20000) 
			{
                if (cibil >= 750) 
				{
                    if (isExistingCustomer) 
					{
                        System.out.println(name + " Eligible for Premium Loan ");
                    } 
					else 
					{
                        System.out.println(name + " Eligible for Standard Loan");
                    }
                } 
				else if (cibil >= 650) 
				{
                 System.out.println(name + " Eligible for Low Amount Loan");
                } 
				else 
				{
                    System.out.println(name + " Not Eligible (Low CIBIL Score)");
                }
            } 
			else 
			{
                System.out.println(name + " Not Eligible (Low Salary)");
            }
        } 
		else 
		{
            System.out.println(name + " Not Eligible (Age criteria not satisfied)");
        }
        sc.close();
    }
}