package homework.bifunction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String text1 = "Hello Java world";
        String text2 = "Hello Python";

        BiFunction<String, String, String[]> biFunction = (s1, s2) -> {
            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("[\\W]")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("[\\W]")));
            set1.retainAll(set2);
            return set1.toArray(new String[0]);
        };

        System.out.println(Arrays.toString(biFunction.apply(text1, text2)));
    }
}
