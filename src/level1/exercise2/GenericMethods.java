package level1.exercise2;

public class GenericMethods {

    public static <T1, T2, T3>void showParameters(T1 firstParam, T2 secondParam, T3 thirdParam) {
        System.out.println("| " + firstParam + " | " + secondParam + " | " + thirdParam + " | ");
    }
}
