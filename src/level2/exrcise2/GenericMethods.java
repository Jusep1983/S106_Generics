package level2.exrcise2;

import java.util.ArrayList;

public class GenericMethods {

    public static <T1, T2, T3> void showParameters(ArrayList<T1> firstParam, ArrayList<T2> secondParam, ArrayList<T3> thirdParam) {

        System.out.println("| " + firstParam + " |\n| " + secondParam + " |\n| " + thirdParam + " | ");
    }

}
