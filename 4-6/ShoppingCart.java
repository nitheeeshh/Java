package newpackage;
import java.util.Scanner;

public class ShoppingCart {
    // Outer class variable
    String cartOwnerName;

    public ShoppingCart(String cartOwnerName) {
        this.cartOwnerName = cartOwnerName;
    }

    // Inner class
    class Item {
        String itemName;
        double price; // Represents the latest price
        int quantity;
        double[] priceHistory; // Array to store historical prices

        // Add Item
        public void addItem(String itemName, int quantity, int historySize) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.priceHistory = new double[historySize];
        }

        // Update Price History
        public void updatePriceHistory(Scanner sc) {
            System.out.println("\nEnter Prices:");
            for (int i = 0; i < priceHistory.length; i++) {
                priceHistory[i] = sc.nextDouble();
            }
            
            // Loop through array to find the latest price (last entered item)
            if (priceHistory.length > 0) {
                price = priceHistory[priceHistory.length - 1];
            }
        }

        // Calculate Total Bill
        public double calculateTotalBill() {
            return price * quantity;
        }

        // Display Cart Details
        public void displayCartDetails() {
            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);
            
            System.out.print("Price History: ");
            for (double p : priceHistory) {
                // Cast to integer to match your desired sample output
                System.out.print((int) p + " "); 
            }
            
            System.out.println("\nLatest Price: " + (int) price);
            System.out.println("Total Bill: " + (int) calculateTotalBill());
        }
    }}