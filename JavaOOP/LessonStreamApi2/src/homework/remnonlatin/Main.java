package homework.remnonlatin;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Hello difficult Java.";
        System.out.println(text);

        text = text.replaceAll("\\s", System.lineSeparator())
                .lines()
                .filter(s -> s.length() <= 5)
                .collect(Collectors.joining(" "));
        System.out.println(text);
    }
}