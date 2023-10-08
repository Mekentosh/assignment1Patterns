public class AuthService {
    private static AuthService instance;
    private AuthStrategy strategy;

    private AuthService() {}

    public static AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public void setAuthStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticate(String username, String password) {
        return strategy.authenticate(username, password);
    }
}
