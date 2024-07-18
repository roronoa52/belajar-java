package ImmutableApp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Farhan");
        mutable.add("Yudha");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Eko", "Kurniawan", "Khannedy");


    }
}
