public class AuthService {
    private static AuthService instance;

    private AuthService() {}

    public static AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    private AuthStrategy strategy;

    public void setAuthStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticate(String username, String password) {
        return strategy.authenticate(username, password);
    }
}