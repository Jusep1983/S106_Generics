package level1.exercise2;

public class Person {
    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Soy " + name + " " + surname + " tengo " + age + " años";
    }

}
