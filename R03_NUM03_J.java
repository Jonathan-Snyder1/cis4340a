//imports
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//Compliant version fix by converting unsigned int to long

public class R03_NUM03_J {

    public static long readUnsignedInt(DataInputStream in) throws IOException {
        return in.readInt() & 0xFFFFFFFFL;
    }

    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(
                    new FileInputStream("data.bin"));

            long value = readUnsignedInt(in);
            System.out.println("Value: " + value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
