import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {

        BankAccount account = new BankAccount();

        account.deposit(500);

        assertEquals(1500,
                account.getBalance());
    }

    @Test
    void testWithdraw() {

        BankAccount account = new BankAccount();

        boolean result = account.withdraw(300);

        assertTrue(result);
        assertEquals(700,
                account.getBalance());
    }

    @Test
    void testInsufficientBalance() {

        BankAccount account = new BankAccount();

        boolean result = account.withdraw(5000);

        assertFalse(result);
        assertEquals(1000,
                account.getBalance());
    }

    @Test
    void testBalance() {

        BankAccount account = new BankAccount();

        assertEquals(1000,
                account.getBalance());
    }
}