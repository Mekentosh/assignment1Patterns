public class EmailPasswordAuth implements AuthStrategy {
    @Override
    public boolean authenticate(String username, String password) {

        if (username.equals("123@gmail.com") && password.equals("123")) {
            return true;
        }
        return false;
    }
}