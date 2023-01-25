package homework.catremsort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("UmkA", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");

        List<Cat> cats = List.of(cat1,cat2,cat3,cat4);

        System.out.println(cats.stream()
                .filter(Objects::nonNull)
                .filter(cat -> cat.getWeight()>=3)
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.toList())
        );
    }
}
