package Interface;

public class Avanza implements Car{

    public void drive() {
        System.out.println("This is drive");
    }

    public void getTire() {
        System.out.println("This is get tire");
    }

    @Override
    public void getBrand() {
        System.out.println("This is get brand");
    }
}
