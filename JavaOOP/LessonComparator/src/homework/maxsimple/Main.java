package homework.maxsimple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(8, 13, 7, 9, 1, 2, 4, 6, -15));
        List<Integer> list2 = new ArrayList<>(List.of(8, 9, 1, 4, 6, -15));
        List<Integer> list3 = new ArrayList<>(List.of(8, 9, 2, -10, 6));

        Comparator<Integer> compIsSimple = (o1, o2) -> {
            if (isSimple(o1) && isSimple(o2)) {
                return -Integer.compare(o1, o2);
            } else if (isSimple(o1) && !isSimple(o2)) {
                return -1;
            } else if (!isSimple(o1) && isSimple(o2)) {
                return 1;
            } else
                return Integer.compare(o1, o2);
        };

        System.out.println(list1);
        System.out.println(Collections.min(list1, compIsSimple));

        System.out.println(list2);
        System.out.println(Collections.min(list2, compIsSimple));

        System.out.println(list3);
        System.out.println(Collections.min(list3, compIsSimple));


    }

    private static boolean isSimple(int integer) {
        if (integer == 2 || integer == 3 || integer == 5 || integer == 7)
            return true;
        else if (integer % 2 == 0 || integer<=1)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(integer); i += 2) {
                if (integer % i == 0)
                    return false;
            }
        }
        return true;
    }
}
