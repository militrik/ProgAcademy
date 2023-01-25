package homework.remstring;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Helloтобі difficultова Java.";
        System.out.println(text);

        text = text.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch <= 0x80)
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(text);
    }
}