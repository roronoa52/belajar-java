package constructor;

public class Person {

    String name;
    Integer age;
    final String city = "medan";

    Person(String ParamName, Integer ParamAge){
        name = ParamName;
        age = ParamAge;
    }

    Person(String ParamName){
        // memanggil constructor diatasnya
        this(ParamName, null);
    }

    Person(){
        // memanggil constructor diatasnya
        this(null, null);
    }

    void Sayhello(String ParamName){
        System.out.println("Hello " + ParamName + " My name is: " + name);
    }
}
