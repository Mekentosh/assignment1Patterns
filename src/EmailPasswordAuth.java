public class EmailPasswordAuth implements AuthStrategy {
    @Override
    public boolean authenticate(String username, String password) {

        return true;
    }
}
