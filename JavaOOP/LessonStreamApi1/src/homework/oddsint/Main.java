package homework.oddsint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 6, 5, 4, 7, 8, 9);

        Stream<Integer> listStream = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .sorted();
        System.out.println(listStream.collect(Collectors.toList()));
    }
}