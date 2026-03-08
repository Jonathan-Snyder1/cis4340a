import java.math.BigInteger;

//noncompliant version
// convert BigInteger to byte array, make string from bytes then convert back

public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);

        System.out.println(x);
    }
}
