package constructor;

public class Person {

    String name;
    Integer age;
    final String city = "medan";

    Person(String ParamName, Integer ParamAge){
        name = ParamName;
        age = ParamAge;
    }

    void Sayhello(String ParamName){
        System.out.println("Hello " + ParamName + " My name is: " + name);
    }
}
