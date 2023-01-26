package homework.intslastdig;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 22, 333, 666, 55, 4, 7, 88, 999);

        Stream<Integer> intStream = integerList.stream()
                .filter(integer -> integer > 10)
                .sorted((o1, o2) -> {
                    int int1 = Integer.parseInt(o1.toString().substring(o1.toString().length() - 1));
                    int int2 = Integer.parseInt(o2.toString().substring(o2.toString().length() - 1));
                    return Integer.compare(int1, int2);
                });
        intStream.forEach(System.out::println);
    }
}
