package level2.exrcise1;

public class GenericMethods {

    public static <T1, T2> void showParameters(T1 firstParam, T2 secondParam, int thirdParam) {
        System.out.println(" | " + firstParam + " | " + secondParam + " | " + thirdParam + " | ");
    }
}
