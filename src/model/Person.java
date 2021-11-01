package model;

public class Person implements Moving {
    private String name;
    private String surname;
    private int age;
    public Heart heart;

    //nested internal
    public class Heart{
        private String description;

        {
            description = "Beautiful!";
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Heart(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "WOW!!! This is a new heart{" +
                    "description='" + description + '\'' +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //local
    public interface NameContainer {
        String getName();
    }

    public NameContainer getNameContainer() {
        class PersonNameContainer implements NameContainer {
            final String name = Person.this.name;

            @Override
            public String getName() {
                return ("Name: " + this.name);
            }
        }
        return new PersonNameContainer();
    }




    public Person(String name, String surname, int age, String heartDescription) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        heart = new Heart(heartDescription);
    }

    @Override
    public String toString() {
        return " Person: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }

    //lib
    public static double agePlusPI(Person person){
        return person.getAge() + Math.PI;
    }

    @Override
    public void running() {
        System.out.println("This person runs like a human");
    }
}
