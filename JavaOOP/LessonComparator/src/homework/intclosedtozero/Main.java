package homework.intclosedtozero;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Random rn = new Random();
       List<Integer> list = new ArrayList<>(List.of(-2, -2, 2, 5, 7, -5, -7));

        System.out.println(list);

        Comparator<Integer> comp1 = Comparator.comparingInt(Math::abs);
        Comparator<Integer> comp2 = Comparator.comparingInt(a -> -a);

        list.sort(comp1.thenComparing(comp2));

        System.out.println(list);
        System.out.println(list.get(0));
    }
}
