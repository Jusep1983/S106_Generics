package level3;

import level3.model.Generic;
import level3.model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone xiaomi = new Smartphone("Redmi Note 40k");

        System.out.println(Generic.methodOfTelephone(xiaomi, 666111555));

        System.out.println(Generic.methodOfSmartphone(xiaomi));

    }

}
