package InitLambda;

public class Main {

    public static void main(String[] args) {

        // menggunakan anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Anonymous Yp";
            }
        };

        System.out.println(simpleAction1.action("Yp"));


        // menggunakan Lamda
        SimpleAction simpleAction2 = (String name) -> {
            return "Lambda Yp";
        };

        System.out.println(simpleAction2.action("Yp"));

        // lambda tanpa tipe data paameter
        SimpleAction simpleAction3 = (name) -> {
            return "Lambda Yp";
        };

        // lambda tanpa block dan tipe data paameter
        SimpleAction simpleAction4 = (name) -> "Lambda Yp";

    }

}
