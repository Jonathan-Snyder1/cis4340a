//FIO02 Detect and handle file-related errors
//compliant version 
//fix by checking file deletion result

//import
import java.io.File;

public class R13_FIO02_J {
    public static void main(String[] args) {
        File file = new File("temp.txt");

        if (!file.delete()) {
            System.out.println("Failed to delete temp.txt");
        } else {
            System.out.println("Deleted temp.txt successfully");
        }
    }
}
