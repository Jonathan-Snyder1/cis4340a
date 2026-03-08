public class R00_IDS03_J {
    public static void main(String[] args) {
        String username = "bad$user";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            System.err.println("User login succeeded for: " + username);
        } else {
            System.err.println("User login failed for: " + username);
        }
    }
}
