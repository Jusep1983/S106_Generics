package level2.exrcise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person juanito = new Person("Juanito", "Sánchez", 45);
        Person manolito = new Person("Manolito", "López", 17);
        Person pepita = new Person("Pepita", "Martín", 78);
        ArrayList<Person> firstList = new ArrayList<>(Arrays.asList(juanito,manolito,pepita));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        ArrayList<Character> thirdList = new ArrayList<>(Arrays.asList('*','@','#','+','?','€'));
        GenericMethods.showParameters(firstList,secondList,thirdList);
    }

}
