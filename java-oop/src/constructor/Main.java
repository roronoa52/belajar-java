package constructor;

public class Main {

    public static void main(String[] args) {
        var person1 = new Person("Yp", 23);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.city);
        person1.Sayhello("Asep");
    }

}
