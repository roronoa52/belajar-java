package Classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Farhan");
        builder.append(" ");
        builder.append("Yudha");
        builder.append(" ");
        builder.append("Pratama");

        String name = builder.toString();
        System.out.println(name);
    }
}
