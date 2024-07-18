package GenericMethod;

public class Main {
    public static void main(String[] args) {

        String[] name = {"farhan", "yudha", "pratama"};
        Integer[] number = {1,2,3,4,5};

        // tipe genericnya ditulis langsung
        System.out.println(ArrayHelper.<String>count(name));

        // tipe genericnya tidak di tulis langsung
        System.out.println(ArrayHelper.count(number));

    }
}
