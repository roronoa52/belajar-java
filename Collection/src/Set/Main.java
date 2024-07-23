package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // data tidak berurut
//        Set<String> names = new HashSet<>();

        // data berurut
        Set<String> names = new LinkedHashSet<>();
        names.add("tes1");
        names.add("tes2");
        names.add("tes3");
        names.add("tes1");
        names.add("tes2");
        names.add("tes3");

        for (var name : names){
            System.out.println(name);
        }
    }

}
