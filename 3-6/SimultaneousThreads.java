package javaapplication26;
     public class SimultaneousThreads {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        System.out.println("Starting both threads...");
        t1.start();
        t2.start();
    }
}