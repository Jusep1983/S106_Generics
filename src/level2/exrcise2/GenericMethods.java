package level2.exrcise2;
/*
- Exercici 2
Modifica l'apartat anterior de manera que els
arguments del mètode genèric siguin una llista
d'arguments de variable indefinida.
 */

import java.util.ArrayList;

public class GenericMethods {

    public static <T1,T2,T3> void showParameters(ArrayList<T1> firstParam, ArrayList<T2> secondParam, ArrayList<T3> thirdParam) {
        System.out.println("| " + firstParam + " |\n| " + secondParam + " |\n| " + thirdParam + " | ");
    }

}
