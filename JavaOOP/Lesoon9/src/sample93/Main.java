package sample93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Hello world");
        list1.add("Hello Java");
        list1.add("Hello NEW YEAR");

        List<Pair<Integer, String>> list2 = new ArrayList<>();

        list2.add(new Pair<>(1, "one"));
        list2.add(new Pair<>(3, "three"));
        list2.add(new Pair<>(2, "two"));

        System.out.println(list1);
        System.out.println(list2);

        list1.add(1, "Hello Python");

        System.out.println(list1);

        String text = list1.get(1);

        Pair<Integer, String> pair3 = list2.get(0);

        System.out.println(text);
        System.out.println(pair3);

        list1.remove(2);

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list2, new PairComparator());
        System.out.println(list2);
        System.out.println();
        for (String element : list1) {
            System.out.println(element);
        }
        System.out.println();

        Iterator<String> itr = list1.iterator();
        for (; itr.hasNext();) {
            String element = itr.next();
            System.out.println(element);
        }

    }
}