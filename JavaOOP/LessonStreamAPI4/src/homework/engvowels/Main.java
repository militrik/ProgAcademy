package homework.engvowels;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text = "vds r gcgf Oo London is the capital of Great Britain";
        String[] words = text.split(" ");
        Stream<String> stream = Arrays.stream(words);
        List<String> list = stream
                .sorted(Comparator.comparingInt(Main::checkVowels))
                .dropWhile(s -> checkVowels(s) == 0)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static int checkVowels(String s) {
        return s.length() - s.replaceAll("[AEIOUYaeiouy]", "").length();
    }
}