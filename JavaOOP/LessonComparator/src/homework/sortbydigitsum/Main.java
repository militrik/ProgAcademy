package homework.sortbydigitsum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(62, 2000, 306, 55));

        Function<Integer, Integer> fun = integer -> {
            String str = integer + "";
            return str.charAt(0) + str.charAt(str.length() - 1);
        };

        Comparator<Integer> comp = Comparator.comparing(fun, Comparator.naturalOrder());

        list.sort(comp);
        System.out.println(list);
    }
}
