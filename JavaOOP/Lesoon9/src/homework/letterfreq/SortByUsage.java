package homework.letterfreq;

import java.util.Comparator;
import java.util.Map;

public class SortByUsage implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry<Character, Integer> s1 = (Map.Entry<Character, Integer>) o1;
        Map.Entry<Character, Integer> s2 = (Map.Entry<Character, Integer>) o2;
        return s2.getValue().compareTo(s1.getValue());
    }
}
