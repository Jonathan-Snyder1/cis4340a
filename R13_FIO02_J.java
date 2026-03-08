//FIO02 Detect and handle file-related errors
//non compliant version return value is ignored

//import
import java.io.File;

public class R13_FIO02_J {
    public static void main(String[] args) {
        File file = new File("temp.txt");
        file.delete(); // ignores whether deletion succeeded
        System.out.println("Finished.");
    }
}
