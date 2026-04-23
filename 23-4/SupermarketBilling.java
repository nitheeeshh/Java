import java.util.Scanner;

public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get number of items
        System.out.print("Enter number of items: ");
        int numItems = sc.nextInt();

        // 2. Store prices in an array
        double[] prices = new double[numItems];
        double totalAmount = 0;

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
            totalAmount += prices[i]; // Accumulate total
        }

        // 3. Calculate discount
        double discountRate = 0;
        if (totalAmount > 5000) {
            discountRate = 0.20; // 20%
        } else if (totalAmount > 2000) {
            discountRate = 0.10; // 10%
        }

        double discountAmount = totalAmount * discountRate;
        double finalAmount = totalAmount - discountAmount;

        // 4. Display results
        System.out.println("\n------ BILL DETAILS ------");
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Discount     : " + discountAmount);
        System.out.println("Final Amount : " + finalAmount);
        System.out.println("--------------------------");
    }
}