public class LoggingAuthServiceDecorator implements AuthDecorator {

    private final AuthStrategy authService;

    public LoggingAuthServiceDecorator(AuthStrategy authService) {
        this.authService = authService;
    }

    @Override
    public boolean authenticate(String username, String password) {

        System.out.println("Logging: Attempting authentication for " + username);
        boolean success = authService.authenticate(username, password);


        if (success) {
            System.out.println("Logging: Authentication successful for " + username);
        } else {
            System.out.println("Logging: Authentication failed for " + username);
        }

        return success;
    }
}
