package homework.mininlist;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(5, 0, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(10, -2, 5));

        List<String> list3 = new ArrayList<>(List.of("Hello", "Java", "world"));
        List<String> list4 = new ArrayList<>(List.of("55555", "4444", "333"));

        Comparator<Object> comp = (o1, o2) -> {
            return 1;//o1.compareTo(o2);
        };
/*        BinaryOperator<List> minInList = (l1, l2) -> {
            Object min1= Collections.min(l1);
            Object min2= Collections.min(l2);
            if(min1>min2)
                return 1;
            if(min1<min2)
                return -1;
            return  0;

        };*/

        System.out.println(BinaryOperator.minBy(comp).apply(list1, list2));
        System.out.println(BinaryOperator.minBy(comp).apply(list3, list4));
    }


}
