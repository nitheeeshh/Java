package HW_25_06.Ques2;
class Car extends Vehicle {
    int seats;

    // Constructor using super to initialize base attributes
    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    // Override displayInfo to include seats
    @Override
    public void displayInfo() {
        System.out.println("Car:");
        super.displayInfo(); // Calls the displayInfo() from Vehicle
        System.out.println("Seats: " + seats);
    }
}