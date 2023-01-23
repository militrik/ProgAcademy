package homework.longstr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        BinaryOperator<String> stringBinaryOperator = (s1, s2) -> {
            Comparator<String> stringComparator = Comparator.comparingInt(String::length);
            List<String> words1 = Arrays.asList(s1.split("\\W"));
            List<String> words2 = Arrays.asList(s2.split("\\W"));

            String str1 = Collections.max(words1, stringComparator);
            String str2 = Collections.max(words2, stringComparator);
            return BinaryOperator.maxBy(stringComparator).apply(str1,str2);
        };

        System.out.println(stringBinaryOperator.apply("System out println     ", "string Binary Operator apply"));
    }
}