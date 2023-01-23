package homework.mininlist;


import java.util.*;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(5, 0, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(10, -2, 5));

        List<String> list3 = new ArrayList<>(List.of("Hey", "Hello", "Java", "world"));
        List<String> list4 = new ArrayList<>(List.of("55555", "44444", "666666"));


        System.out.println(minNumber(list1, list2));
        System.out.println(minNumber(list3, list4));
    }

    public static <T> List<T> minNumber(List<T> a, List<T> b) {
        T mina = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (((Comparable<T>) a.get(i - 1)).compareTo(a.get(i)) < 0) {
                mina = a.get(i - 1);
            } else {
                mina = a.get(i);
            }
        }
        T minb = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            if (((Comparable<T>) b.get(i - 1)).compareTo(b.get(i)) < 0) {
                minb = b.get(i - 1);
            } else {
                minb = b.get(i);
            }
        }
        BinaryOperator<T> bin = (y, z) -> {
            if (((Comparable<T>) y).compareTo((T) z) < 0) {
                return y;
            } else {
                return z;
            }
        };
        if (bin.apply(mina, minb) == mina) {
            return a;
        } else {
            return b;
        }

    }
}
