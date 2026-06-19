import com.mycompany.mavenproject4.StringOperations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringOperationsTest {

    StringOperations obj = new StringOperations();

    @Test
    void testReverseString() {
        assertEquals("avaJ", obj.reverseString("Java"));
    }

    @Test
    void testRemoveSpaces() {
        assertEquals("HelloWorld",
                obj.removeSpaces("Hello World"));
    }

    @Test
    void testDuplicates() {
        String result = obj.findDuplicates("programming");

        assertTrue(result.contains("r"));
        assertTrue(result.contains("g"));
        assertTrue(result.contains("m"));
    }
}