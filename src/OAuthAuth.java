public class OAuthAuth implements AuthStrategy {
    @Override
    public boolean authenticate(String username, String password) {

        if (username.equals("123")) {
            return true;
        }
        return false;
    }
}