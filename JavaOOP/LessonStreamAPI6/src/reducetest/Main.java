package reducetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(List.of(3, 17, 20, 28));
        List<Integer> secondList = new ArrayList<>(List.of(4, 17, 20, 30));
        BinaryOperator<List<Integer>> binOp = Main::minNumber;
        System.out.println(binOp.apply(firstList, secondList));

        List<String> wordsList1 = new ArrayList<>(List.of("Maybe", "Yes", "Maybe", "No"));
        List<String> wordsList2 = new ArrayList<>(List.of("Maybe", "Rain", "Maybe", "Snow"));
        BinaryOperator<List<String>> binStr = Main::minNumber;
        System.out.println(binStr.apply(wordsList1, wordsList2));
    }

    public static <T extends Comparable<T>> List<T> minNumber(List<T> firstList, List<T> secondList) {
        T list1 = Collections.min(firstList);
        T list2 = Collections.min(secondList);

        if (list1.compareTo(list2) < 0) {
            return firstList;
        }
        if (list2.compareTo(list1) > 0) {
            return secondList;
        }
        if (list1.equals(list2)) {
            return firstList;
        }
        return null;
    }
}