package homework.intclosedtozero;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random rn = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
                  integerList.add(rn.nextInt(-10,20 ));
        }
        System.out.println(integerList);

        System.out.println( Math.abs(Collections.min(integerList, Comparator.comparingInt(Math::abs))));
    }
}
