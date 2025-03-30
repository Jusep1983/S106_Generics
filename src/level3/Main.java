package level3;

public class Main {

    public static void main(String[] args) {

        Smartphone xiaomi = new Smartphone("Redmi Note 40k");

        System.out.println(Generic.methodOfTelephone(xiaomi, 666111555));

        System.out.println(Generic.methodOfSmartphone(xiaomi));

    }

}
