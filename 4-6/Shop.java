package newpackage;
import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Capture initial inputs
        System.out.print("Enter Cart Owner Name: ");
        String ownerName = sc.nextLine();
        // Instantiate Outer Class
        ShoppingCart cart = new ShoppingCart(ownerName);
        // Instantiate Inner Class
        ShoppingCart.Item item = cart.new Item();
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();        
        System.out.print("Enter Number of Price Updates: ");
        int historySize = sc.nextInt();
        // Execute inner class methods
        item.addItem(itemName, quantity, historySize);
        item.updatePriceHistory(sc);
        item.displayCartDetails();
    }
}

