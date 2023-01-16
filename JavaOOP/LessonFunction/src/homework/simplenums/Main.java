package homework.simplenums;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {5, 6, 7, 8, 9, 10};

        Function<Integer[], Integer> pr1 = integers -> {
            Predicate<Integer> pr2 = Main::isSimple;
            int cnt = 0;
            for (Integer element : integers
            ) {
                if (pr2.test(element))
                    cnt++;
            }
            return cnt;
        };

        System.out.println(pr1.apply(arrInt));
    }

    private static boolean isSimple(Integer integer) {
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