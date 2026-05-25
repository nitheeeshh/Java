package HW_25_06.Ques2;
public class VehicleManagementSystem {
    public static void main(String[] args) {
        System.out.println("Vehicle Management System");
        System.out.println("-------------------------");
        
        // Create objects with sample values
        Car myCar = new Car("Toyota", 2022, 5);
        Motorcycle myBike = new Motorcycle("Yamaha", 2020, "Sports");
        
        // Call displayInfo() on both objects
        myCar.displayInfo();
        System.out.println(); // Prints a blank line for formatting
        myBike.displayInfo();
    }
}