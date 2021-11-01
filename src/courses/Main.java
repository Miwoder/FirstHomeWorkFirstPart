package courses;

import model.Moving;
import model.Person;

import java.util.function.Predicate;

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



        Predicate<String> somePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return !string.isEmpty();
            }
        };
        System.out.println("Anonymous: " + somePredicate.test("Something"));

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        System.out.println("Lambda: " + nonEmptyStringPredicate.test(""));

    }


}
