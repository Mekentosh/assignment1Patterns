public class Main {

    public static void main(String[] args) {

        AuthStrategy authService = new EmailPasswordAuth(); // or new OAuthAuth() for OAuth


        authService = new LoggingAuthServiceDecorator(authService);


        authService = new ThrottlingAuthServiceDecorator(authService, 3);


        authService.authenticate("user123", "password123");
        authService.authenticate("user456", "password456");
        authService.authenticate("user789", "password789");
        authService.authenticate("user999", "password999");
    }
}
