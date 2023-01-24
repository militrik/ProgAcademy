package homework.stringsupplier;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Hello", "world", "Java");

        Optional<String> name = Optional.ofNullable(findWordByCapital(wordsList));
        String result = name.orElseGet(() -> "Capital char not found.");
    }

    private static String findWordByCapital(List<String> list) {
        Predicate<String> pr1 = s -> s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
        for (String word : list) {
            if (pr1.test(word)) {
                System.out.println("\""+ word + "\" has capatal letter");
            }
        }
        return null;
    }
}
