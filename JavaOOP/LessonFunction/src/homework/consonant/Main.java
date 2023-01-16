package homework.consonant;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "$%Hello JAVA world!!!11";

        Function<String, Integer> fun1 = a -> a.toLowerCase().replaceAll("[aeiou\\W\\d]", "").length();
        System.out.println(fun1.apply(text));
    }
}
