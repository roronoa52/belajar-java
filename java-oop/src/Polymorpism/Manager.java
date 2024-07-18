package Polymorpism;

public class Manager extends Employee {

    String name;
    Integer age;
    final String city = "medan";

    void Sayhello(String name){
        System.out.println("Hello " + name + " My name is: " + this.name);
    }

    int GetAge(){
        return 52;
    }

}
