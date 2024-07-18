package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Farhan");
        collection.add("Yudha");
        collection.add("Pratama");
        collection.addAll(List.of("tes1", "tes2", "tes3"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("tes1");
        collection.remove("tes2");
        collection.removeAll(List.of("tes3", "Farhan"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Yudha")
        );

        System.out.println(
                collection.containsAll(List.of("Yudha", "Pratama"))
        );

        System.out.println(collection.size());

    }
}
