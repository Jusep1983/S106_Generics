package level3.model;

import level3.interfaces.Telephone;

public class Generic {

    public static <T extends Telephone> String methodOfTelephone(T object, int number) {
        return object.call(number);
    }

    public static <T extends Smartphone> String methodOfSmartphone(T smartphone) {
        return smartphone.takeAPhotograph();
    }

}
