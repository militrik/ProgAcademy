package homework.catcompareto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsi", 5);
        Cat cat4 = new Cat("Tim", 15);
        Cat cat5 = new Cat("Kuzia", 2);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
        Arrays.sort(cats);

        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();

        System.out.println(cat1.equals(cat2) + "," + cat1.compareTo(cat2));
        System.out.println(cat1.compareTo(cat2) + "," + cat1.equals(cat2) );
        System.out.println();

        Set<Cat> set = new HashSet<>();
        System.out.println(set.add(cat1));
        System.out.println(set.add(cat2));
        System.out.println(set.add(cat3));
        System.out.println(set.add(cat4));
        System.out.println(set.add(cat5));


    }

    public static int sgn(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}
