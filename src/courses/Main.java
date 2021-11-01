package courses;

import model.Moving;
import model.Person;

public class Main {

    public static void main(String[] args) {
        Person man = new Person("Vadim", "Govoronok", 20, "Beautiful!");
        System.out.println(man.toString());
        System.out.println(Person.agePlusPI(man));
        System.out.println(man.heart.toString());
        man.running();

        Person.NameContainer name = man.getNameContainer();
        System.out.println(name.getName());

        Moving humanRunning = new Moving() {
            @Override
            public void running() {
                System.out.println("Someone is running");
            }
        };
        humanRunning.running();


    }


}
