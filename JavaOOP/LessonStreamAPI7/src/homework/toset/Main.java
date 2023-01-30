package homework.toset;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,6,5,5,5,4,7,8,9);
        List<String> strings = List.of("aa", "cc", "dd", "bb", "dd");
        Set<Integer> result1 = numbers.stream()
                .collect(HashSet::new, HashSet::add, AbstractCollection::addAll);
        Set<String> result2 = strings.stream()
                .collect(HashSet::new, HashSet::add, AbstractCollection::addAll);


        System.out.println(result1);
        System.out.println(result2);
    }
}

