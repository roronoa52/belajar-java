package constructor;

public class Person {

    String name;
    Integer age;
    final String city = "medan";

    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    Person(String ParamName){
        // memanggil constructor diatasnya
        this(ParamName, null);
    }

    Person(){
        // memanggil constructor diatasnya
        this(null, null);
    }

    void Sayhello(String name){
        System.out.println("Hello " + name + " My name is: " + this.name);
    }
}
