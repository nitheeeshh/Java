package javaapplication26;
class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A is running - Iteration: " + i);
            try {
                Thread.sleep(500); // Short delay to easily see the threads interleaving
            } catch (InterruptedException e) {
                System.out.println("Thread A interrupted.");
            }
        }
    }
}