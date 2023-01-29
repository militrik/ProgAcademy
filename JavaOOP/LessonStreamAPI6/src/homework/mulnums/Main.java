package homework.mulnums;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 6, 5, 4, 7, 8, 9);

        System.out.println(list.stream().reduce((int1, int2) -> int1 * int2).get());

    }
}
