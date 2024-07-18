package GenericMultipleParameter;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.setFirst("sepuluh");
        pair.setSecond(10);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
