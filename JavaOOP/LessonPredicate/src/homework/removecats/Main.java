package homework.removecats;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    static int minAge = 5;
    static char belowChar = 'C';
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Umka", 12),
                new Cat("Luska", 5),
                new Cat("Barsic", 8),
                new Cat("Timka", 4),
                new Cat("Kuzia", 2)
        ));
        System.out.println(cats);


        Predicate<Cat> pr1 = a -> {
            return a.getAge() < minAge;
        };
        //Predicate<Cat> pr2 = a -> a.getName().charAt(0) > belowChar;
        //Predicate<Cat> pr2 = Main::isCharBelow;
        cats.removeIf(pr1.and(Main::isCharBelow));
        System.out.println(cats);

    }

    public static boolean isCharBelow(Cat cats) {
        return cats.getName().charAt(0) > belowChar;
    }

}
