package newpackage; 
class UserSession {
    private static UserSession instance;
    private String userName;

    private UserSession() {
        if (instance != null) {
            throw new RuntimeException(
                "Use getInstance() method.");
        }
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setUser(String name) {
        this.userName = name;
    }

    public void showUser() {
        System.out.println("Current User: " + userName);
    }
}