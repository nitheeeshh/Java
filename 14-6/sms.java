package javaapplication43;
public class sms implements Notification {

    @Override
    public void send() {
        System.out.println("Text from sms");
    }
    
}