//ERR04-J Do not complete abruptly from a finally block
//compliant version
//fix by removing return from finally block

public class R07_ERR04_J {

    public static int getNumber() {
        int result;
        try {
            result = 1;
        } finally {
            System.out.println("Cleanup completed.");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
