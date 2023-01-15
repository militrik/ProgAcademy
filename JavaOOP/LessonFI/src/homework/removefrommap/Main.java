package homework.removefrommap;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of(
                0, "Hello",
                1, "1",
                2, "22",
                3, "333",
                4, "4444",
                159, "World",
                5, "55555",
                6, "666666",
                777, "Java",
                7, "7777777"
        ));
        System.out.println(map);

        BiPredicate<Integer, String> pr1 = (integer, string) -> integer != string.length();
        map.entrySet().removeIf(entry -> pr1.test(entry.getKey(), entry.getValue()));

/*        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (pr1.test(n, map.get(n)))
                it.remove();
        }*/
        System.out.println(map);
    }
}


