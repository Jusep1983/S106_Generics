package level2.exrcise2;

import java.util.List;

public class GenericMethods {

    public static void showParameters(List<?>... parameter) {
        for (List<?> list : parameter) {
            System.out.println(list);
        }
    }

}
