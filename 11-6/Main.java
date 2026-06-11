package javaapplication1.newpackage;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            MessageLogger logger = MessageLogger.getInstance();
            logger.logMessage("Message from Thread 1");
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            MessageLogger logger = MessageLogger.getInstance();
            logger.logMessage("Message from Thread 2");
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}