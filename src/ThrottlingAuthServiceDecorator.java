public class ThrottlingAuthServiceDecorator implements AuthDecorator {

    private final AuthStrategy authService;
    private final int maxAttempts;
    private int attempts;

    public ThrottlingAuthServiceDecorator(AuthStrategy authService, int maxAttempts) {
        this.authService = authService;
        this.maxAttempts = maxAttempts;
        this.attempts = 0;
    }

    @Override
    public boolean authenticate(String username, String password) {
        if (attempts < maxAttempts) {
            attempts++;
            return authService.authenticate(username, password);
        } else {
            System.out.println("Throttling: Maximum authentication attempts reached.");
            return false;
        }
    }
}
