package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.function.Predicate.isEqual;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        System.out.println("Init \n"+cats);

        cats.removeIf(cat -> cat.getAge() < 4);
        System.out.println("Lambda \n"+cats);

        cats.removeIf(cat -> {
            if (cat.getName().startsWith("Um"))
                return true;
            else
                return cat.getAge() < 5;
        });
        System.out.println("Lambda {} \n"+cats);

        cats.removeIf(Main::testCat);
        System.out.println(":: \n"+cats);

        cats.removeIf(((Predicate<Cat>) cat -> cat.getAge() < 9).and(cat -> cat.getName().startsWith("X")));
        System.out.println("AND \n"+cats);

        Predicate<Cat> pr1 = Predicate.isEqual("Barsic");
        cats.removeIf(cat->cat.getName().equals("Barsic"));
        System.out.println("isEq \n"+cats);
    }

    public static boolean testCat(Cat cat) {
        if (cat.toString() == null)
            return true;
        else
            return false;
    }
}
