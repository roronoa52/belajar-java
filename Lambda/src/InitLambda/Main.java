package InitLambda;

public class Main {

    public static void main(String[] args) {

        // menggunakan anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Anonymous Yp";
            }
        };

        System.out.println(simpleAction1.action());


        // menggunakan Lamda
        SimpleAction simpleAction2 = () -> {
            return "Lambda Yp";
        };

        System.out.println(simpleAction2.action());

    }

}
