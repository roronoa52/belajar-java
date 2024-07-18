package ListApp;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("yp1");
        strings.add("yp2");
        strings.add("yp3");

        strings.set(0, "farhan");

        strings.remove(1);

        for (var val : strings){
            System.out.println(val);
        }
    }
}
