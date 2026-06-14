package javaapplication43;
public class email implements Notification {

    @Override
    public void send() {
        System.out.println("Text from email");
    }
    
}