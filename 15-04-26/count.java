import java.util.Scanner;
class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int inputNumber = sc.nextInt();  
        int originalNumber = inputNumber;
        int count = 0;
        if (inputNumber == 0) {
            count = 1;
        } else {
            if (inputNumber < 0) {
                inputNumber = -inputNumber;
            }
            while (inputNumber > 0) {
                inputNumber = inputNumber / 10; 
                count++;
            }
        }
        System.out.println("Number = " + originalNumber);
        System.out.println("Number of digits = " + count);    
    }
}