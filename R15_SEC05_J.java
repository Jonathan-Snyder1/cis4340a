//SEC05 Do not use reflection to increrase accessibilty of classes, methods, or fields
//non compliant version
// Using reflection can break encapsulation, and cause security vulnerabilities

import java.lang.reflect.Field;


public class R15_SEC05_J {

    private static class SecretData {
        private String password = "superSecret123";
    }

    public static void main(String[] args) {
        try {
            SecretData data = new SecretData();
            Field field = SecretData.class.getDeclaredField("password");
            field.setAccessible(true); // Noncompliant
            System.out.println(field.get(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
