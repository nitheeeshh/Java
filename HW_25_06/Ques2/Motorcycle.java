package HW_25_06.Ques2;
class Motorcycle extends Vehicle {
    String type;

    // Constructor using super to initialize base attributes
    public Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    // Override displayInfo to include motorcycle type
    @Override
    public void displayInfo() {
        System.out.println("Bike:");
        super.displayInfo(); // Calls the displayInfo() from Vehicle
        System.out.println("Type: " + type);
    }
}