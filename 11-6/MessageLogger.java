package javaapplication1.newpackage;
class MessageLogger {
    private static MessageLogger instance;

    private MessageLogger() {
    }

    // Thread-safe Singleton
    public static synchronized MessageLogger getInstance() {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    public void logMessage(String msg) {
        System.out.println(Thread.currentThread().getName()
                + ": " + msg);
    }
}