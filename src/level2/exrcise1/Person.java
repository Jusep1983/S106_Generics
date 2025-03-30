package level2.exrcise1;
/*
- Exercici 1
Modifica l'exercici anterior de manera que un
dels arguments del mètode genèric no sigui genèric.
 */
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
        return "Soy " + name + " " + surname  + " tengo " + age + " años";
    }
}
