import java.util.Objects;

public class User {
    
    // Required parameter
    private final String name;
    
    // Optional parameters
    private final Integer age;
    private final String email;
    private final String phone;

    // Private constructor so objects can only be created via the Builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Getters
    public String getName() { return name; }
    public Integer getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    // Overriding equals() and hashCode() to allow value comparison in tests
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
               Objects.equals(age, user.age) &&
               Objects.equals(email, user.email) &&
               Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phone);
    }

    // Static nested Builder class
    public static class UserBuilder {
        private final String name; // Required
        private Integer age;       // Optional
        private String email;      // Optional
        private String phone;      // Optional

        // The constructor enforces the required fields
        public UserBuilder(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name is a required field and cannot be null or empty.");
            }
            this.name = name;
        }

        // Setter methods for optional fields return the Builder instance for chaining
        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        // The build method constructs the final User object
        public User build() {
            return new User(this);
        }
    }
}