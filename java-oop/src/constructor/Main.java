package constructor;

public class Main {

    public static void main(String[] args) {
        var person1 = new Person("Yp", 23);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.city);
        person1.Sayhello("Asep");

        var person2 = new Person("Yp");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.city);
        person2.Sayhello("Asep");

        var person3 = new Person();
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.city);
        person3.Sayhello("Asep");
    }

}
