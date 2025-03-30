package level3;

public class Smartphone implements Telephone {
    private String name;

    public Smartphone(String name) {
        this.name = name;
    }

    public String takeAPhotograph() {

        return this.name + " esta haciendo una foto";
    }

    @Override
    public String call(int number) {

        return this.name + " esta llamando el número " + number;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
