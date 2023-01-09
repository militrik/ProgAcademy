package sample41;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cat cat1 = new Cat("Luska", 8);
        Cat cat2 = new Cat("Umka", 10);
        Cat cat3 = new Cat("Barsic", 5);
        Cat cat5 = new Cat("Kuzia", 7);
        Cat cat4 = new Cat("Timka", 3);

        Cat[] cats = new Cat[]{cat1, cat2, null, cat3, cat4, null, cat5};

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println();

/*        Arrays.sort(cats, Comparator.nullsFirst(new CatNameComparator().reversed()));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println();*/

        Arrays.sort(cats, Comparator.nullsFirst(new CatNameLengthComparator().thenComparing(new CatNameComparator())));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
        System.out.println();

    }

}
