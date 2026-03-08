//ERR04-J Do not complete abruptly from a finally block
//Noncompliant version


public class R07_ERR04_J {

    public static int getNumber() {
        try {
            return 1;
        } finally {
            return 2; // abruptly completes from finally
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
