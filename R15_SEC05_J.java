//SEC05 Do not use reflection to increrase accessibilty of classes, methods, or fields
//compliant version
//fix by removing reflective access to private field


public class R15_SEC05_J {

    private static class SecretData {
        private String password = "superSecret123";

        public String getMaskedPassword() {
            return "********";
        }
    }

    public static void main(String[] args) {
        SecretData data = new SecretData();
        System.out.println(data.getMaskedPassword());
    }
}
