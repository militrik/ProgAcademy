package homework.longcatname;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Umka", 7, "Black");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");
        List<Cat> list = List.of(cat1, cat2, cat3, cat4);

        System.out.println(list.stream().max(Comparator.comparingInt(o -> o.getName().length())).get());
    }
}