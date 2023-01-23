package homework.liststrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "qwert",
                "qwert5",
                "qwert5y",
                "qwert5yu",
                "qwe"
        ));
        System.out.println(list);

        /*
        First solution
        */
        UnaryOperator<List<String>> uno1 = stringList -> {
            List<String> newList = new ArrayList<>();
            stringList.forEach(s -> {
                if(s.length()>5)
                    newList.add(s);
            });
            return newList;
        };
        System.out.println(uno1.apply(list));

        /*
        Second solution
        */
        UnaryOperator<List<String>> uno2 = stringList -> new ArrayList<>(List.copyOf(stringList));
        Function<List<String>, List<String>> fun2 = stringList -> {
            stringList.removeIf(s -> s.length() <= 5);
            return stringList;
        };
        Function<List<String>, List<String>> fun = uno2.andThen(fun2);
        System.out.println(fun.apply(list));


        System.out.println(list);
    }
}