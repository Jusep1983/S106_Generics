package level1.exercise2;

public class Main {

    public static void main(String[] args) {
        Person juanito = new Person("Juanito", "Sánchez", 45);
        GenericMethods.showParameters(juanito, "Soy un String", '*');
    }
}
