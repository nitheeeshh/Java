package newpackage;

public class Main {
    public static void main(String[] args) {

        UserSession session1 = UserSession.getInstance();
        session1.setUser("Nitheesh");

        UserSession session2 = UserSession.getInstance();

        session1.showUser();
        session2.showUser();

        System.out.println("Same Object? " + (session1 == session2));
    }
}