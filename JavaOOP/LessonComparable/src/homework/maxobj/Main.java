package homework.maxobj;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Integer[] arrayInt = { 12, 43, -354, 5, 23, -5352 };
        System.out.println(max(arrayInt));

        Double[] arrayDouble = { -24.24, 2342.23, -3.56, 242.45 };
        System.out.println(max(arrayDouble));

        String[] arrayString = { "Hello", "Java", "", " ,", "Ukraine" };
        System.out.println(max(arrayString));

    }
    public static <T extends Comparable<T>> T max(T[] array) {
        return Collections.max(Arrays.asList(array));
    }

}
