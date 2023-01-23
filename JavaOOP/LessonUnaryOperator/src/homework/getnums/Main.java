package homework.getnums;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        String text = "Hello 123 world";
        UnaryOperator<String> unaryOperator = s -> s.replaceAll("\\D", "");
        System.out.println(unaryOperator.apply(text));

    }
}