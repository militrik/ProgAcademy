package sample41;

import java.util.Comparator;

public class CatNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;

        if (cat1.getName().compareTo(cat2.getName()) > 0) {
            return 1;
        }

        if (cat2.getName().compareTo(cat2.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}
