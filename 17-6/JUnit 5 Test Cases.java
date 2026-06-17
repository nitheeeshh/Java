import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testRequiredFieldMustBeSet() {
        // Verify that passing null throws an exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User.UserBuilder(null);
        });
        
        assertEquals("Name is a required field and cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testObjectCreationWithOptionalFields() {
        // Create an object using a mix of required and optional fields
        User user = new User.UserBuilder("Alice")
                .age(28)
                .email("alice@example.com")
                .build();

        // Validate fields
        assertEquals("Alice", user.getName(), "Name should match the provided value.");
        assertEquals(28, user.getAge(), "Age should match the provided value.");
        assertEquals("alice@example.com", user.getEmail(), "Email should match the provided value.");
        assertNull(user.getPhone(), "Phone should be null since it was not set.");
    }

    @Test
    public void testCompareExpectedAndActualObjects() {
        // Create an expected user object
        User expectedUser = new User.UserBuilder("Bob")
                .age(35)
                .phone("555-0199")
                .build();

        // Create an actual user object with the exact same data
        User actualUser = new User.UserBuilder("Bob")
                .age(35)
                .phone("555-0199")
                .build();

        // assertEquals relies on the overridden equals() method in the User class
        assertEquals(expectedUser, actualUser, "Objects with identical data should be considered equal.");
    }
}