//imports
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


//highest bit of the 4 byte sequence is 1 readInt() interprets wrongly as a a negative number
//Noncompliant version

public class R03_NUM03_J {

    public static int readUnsignedInt(DataInputStream in) throws IOException {
        return in.readInt(); // incorrect for unsigned values
    }

    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(
                    new FileInputStream("data.bin"));

            int value = readUnsignedInt(in);
            System.out.println("Value: " + value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
