package homework.oddevencollector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 6, 5, 4, 7, 8, 9);

        Map<String, String> result;
        result = list.stream()
                .collect(Collectors.groupingBy(
                        (a -> (a % 2 == 0) ? "even" : "odd"),
                        Collectors.mapping(String::valueOf, Collectors.joining(";"))
                ));

        System.out.println(result);

    }
}