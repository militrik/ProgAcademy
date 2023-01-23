package homework.oddreplace;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 2, 6, 7, 8, 1, 6, 9, 7));
        UnaryOperator<Integer> un = integer -> (integer % 2 == 0 ? integer : 0);
        list.replaceAll(un);
        System.out.println(list);
    }
}