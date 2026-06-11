package javaapplication1;
class PrinterManager {
    // Static instance
    private static PrinterManager instance;

    // Private constructor
    private PrinterManager() {
    }

    // getInstance() method
    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void print() {
        System.out.println("Printing document...");
    }
}