package homework.simplenums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = new Integer[]{5, 6, 7, 8, 9, 10};

        Function<Integer[], Integer> pr1 = integers -> {
            List<Integer> list = new ArrayList<>(Arrays.asList(integers));
            Predicate<Integer> pr2= Main::isSimple;
            list.removeIf(pr2.negate());
            return list.size();
        };

        System.out.println(pr1.apply(arrInt));
    }

    private static boolean isSimple(int integer) {
        if (integer == 1 || integer == 3 || integer == 5 || integer == 7)
            return true;
        if (integer % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(integer); i += 2) {
            if (integer % i == 0)
                return false;
        }
        return true;
    }
}