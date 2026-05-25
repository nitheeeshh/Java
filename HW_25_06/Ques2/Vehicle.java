package HW_25_06.Ques2;
class Vehicle {
    String brand;
    int year;

    // Constructor to initialize attributes
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display basic vehicle info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
