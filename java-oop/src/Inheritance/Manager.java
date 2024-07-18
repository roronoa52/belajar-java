package Inheritance;

public class Manager {

    String name;
    Integer age;
    final String city = "medan";

    void Sayhello(String name){
        System.out.println("Hello " + name + " My name is: " + this.name);
    }

}