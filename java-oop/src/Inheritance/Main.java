package Inheritance;

import constructor.Person;

public class Main {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "manager 1";
        manager.Sayhello("Asep");

        var ViceManager = new ViceManager();
        ViceManager.name = "Vice Manager 1";
        ViceManager.Sayhello("Yp");
        System.out.println(ViceManager.GetAgeParent());

    }
}
