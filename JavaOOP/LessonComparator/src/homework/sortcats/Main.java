package homework.sortcats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Umka", 12),
                new Cat("Luska", 5),
                new Cat("Barsic", 8),
                new Cat("Tim", 5),
                new Cat("Kuzia", 2)
        ));

        cats.sort(Comparator.comparingInt(cat -> cat.getName().length()));
        System.out.println(cats);
    }
}