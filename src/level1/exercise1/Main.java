package level1.exercise1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods firstProof = new NoGenericMethods("String", "hola", "Adios");
        NoGenericMethods secondProof = new NoGenericMethods("Adios", "String", "hola");
        NoGenericMethods thirdProof = new NoGenericMethods("hola", "Adios", "String");

        System.out.println(firstProof.getFirstValue() + " " + firstProof.getSecondValue() + " " + firstProof.getThridValue());
        System.out.println(secondProof.getFirstValue() + " " + secondProof.getSecondValue() + " " + secondProof.getThridValue());
        System.out.println(thirdProof.getFirstValue() + " " + thirdProof.getSecondValue() + " " + thirdProof.getThridValue());

    }
}
