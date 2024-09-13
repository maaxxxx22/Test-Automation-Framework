import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService loginService = new LoginService();

        // Test for valid credentials
        boolean result = loginService.login("testuser", "password");
        assertTrue(result);  // Should pass if credentials are correct
    }

    @Test
    public void testInvalidLogin() {
        LoginService loginService = new LoginService();

        // Test for invalid credentials
        boolean result = loginService.login("invaliduser", "wrongpassword");
        assertFalse(result);  // Should fail if credentials are incorrect
    }
}

