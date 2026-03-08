//DCL02-J — Do not modify the collection's elements during an enhanced for statement

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//compliant version
//fix by using iterator remove

public class R01_DCL02_J {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Bob")) {
                it.remove();
            }
        }

        System.out.println(names);
    }
}
