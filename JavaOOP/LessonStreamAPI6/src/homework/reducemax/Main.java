package homework.reducemax;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> listI = List.of(1, 3, 5, 5, null, 7, 6, 4, 2);
        List<String> listS = List.of("bbb", "ccc", "aaa");

        System.out.println(maxByReduce(listI.stream()).get());
        System.out.println(maxByReduce(listS.stream()).get());
    }

    public static <T extends Comparable<T>> Optional<T> maxByReduce(Stream<T> tStream) {
        return tStream.reduce((t1, t2) -> {
            if (t1.compareTo(t2) > 0) {
                return t1;
            }
            if (t1.compareTo(t2) < 0) {
                return t2;
            }
            if (t1.equals(t2)) {
                return t1;
            }
            return null;
        });
    }
}