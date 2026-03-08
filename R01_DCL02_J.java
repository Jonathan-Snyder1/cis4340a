//DCL02-J — Do not modify the collection's elements during an enhanced for statement

import java.util.ArrayList;
import java.util.List;

// non compliant version 

public class R01_DCL02_J {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            if (name.equals("Bob")) {
                names.remove(name); // modifying during enhanced for loop
            }
        }

        System.out.println(names);
    }
}
