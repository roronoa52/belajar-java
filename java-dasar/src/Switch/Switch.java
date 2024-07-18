package Switch;

public class Switch {
    public static void main(String[] args) {

        var nilai = "C";

        switch (nilai){
            case "A" -> System.out.println("nilai anda A");
            case "B" -> System.out.println("nilai anda B");
            default -> {
                System.out.println("mending anda pulang");
                System.out.println("hahahahahaha");
            }
        }
    }
}
