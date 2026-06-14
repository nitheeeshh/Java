package javaapplication43;

public class JavaApplication43 {
    public static void main(String[] args) {
        Abs pushfactory = new Pushf();
        Abs smsfactory = new Smsf();
        Abs emailfoactory=new emailf();
        Notification push=pushfactory.noticreate();
        Notification sms=smsfactory.noticreate();
        Notification email=emailfoactory.noticreate();
        push.send();
        sms.send();
        email.send();;
    }
}