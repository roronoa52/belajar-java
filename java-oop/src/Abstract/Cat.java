package Abstract;

public class Cat extends Animal{

    @Override
    public void run() {
        System.out.println( this.name + " is run ");
    }
}
