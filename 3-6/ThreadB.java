package javaapplication26;
class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B is running - Iteration: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread B interrupted.");
            }
        }
    }
}