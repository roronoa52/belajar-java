package Classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        joiner.add("Farhan");
        joiner.add("Yudha");
        joiner.add("Pratama");

        String value = joiner.toString();
        System.out.println(value);
    }
}
