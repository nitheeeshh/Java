package javaapplication43;
public class Push implements Notification {

    @Override
    public void send() {
        System.out.println("Text from Push");
    }
    
}
