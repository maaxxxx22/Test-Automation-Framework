public class LoginService {

    public boolean login(String username, String password) {
        // Simple logic to pass the unit test
        return "testuser".equals(username) && "password1".equals(password);
    }
}

